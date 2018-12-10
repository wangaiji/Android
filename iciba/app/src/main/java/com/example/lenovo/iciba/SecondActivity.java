package com.example.lenovo.iciba;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.iciba.db.Word;
import com.example.lenovo.iciba.gson.Paraphrase;
import com.example.lenovo.iciba.gson.Translate;
import com.example.lenovo.iciba.util.HttpUtil;
import com.example.lenovo.iciba.util.Utility;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class SecondActivity extends AppCompatActivity {

    private TextView titleText;
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private Button button;
    private TextView yb1;
    private TextView yb2;
    private LinearLayout changeLayout;
    private LinearLayout partsLayout;
    private LinearLayout sentenceLayout;

    private MediaPlayer mediaPlayer = new MediaPlayer();
    private MediaPlayer mediaPlayer1 = new MediaPlayer();
    private String ph_en_mp3;
    private String ph_am_mp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        titleText = findViewById(R.id.dc_text1);
        imageButton1 = findViewById(R.id.image_btn_dict_horn_accent_eng1);
        imageButton2 = findViewById(R.id.image_btn_dict_horn_accent_usa1);
        yb1 = findViewById(R.id.text_dict_phosymbol_eng1);
        yb2 = findViewById(R.id.text_dict_phosymbol_usa1);
        partsLayout = findViewById(R.id.parts_layout1);
        sentenceLayout = findViewById(R.id.sentence_layout1);
        changeLayout = findViewById(R.id.change_layout1);
        String word = getIntent().getStringExtra("data_return3");
        requestParaphrase(word);

        button = findViewById(R.id.back_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
//                intent.putExtra("id",1);
//                startActivity(intent);
                finish();
            }
        });
    }

    public void requestParaphrase(final String word) {
        String paraphraseUrl = "http://dict.youdao.com/jsonapi?xmlVersion=5.1&client=&q=" + word + "&dicts=&keyfrom=&model=&mid=&imei=&vendor=&screen=&ssid=&network=5g&abtest=&jsonversion=2";
        HttpUtil.sendOkHttpRequest(paraphraseUrl, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d("1234567", "3");
                e.printStackTrace();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(SecondActivity.this, "获取单词失败", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.d("123", "2");
                final String responseText = response.body().string();
                Log.d("123", "4");
                Log.d("123", responseText);
                final Paraphrase paraphrase = Utility.handleParaphraseResponse(responseText);
                paraphrase.save();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("123", "3");
                        if (paraphrase == null) {
                            Log.d("123", "null");
                        }

                        if (paraphrase != null) {
                            Log.d("123", "1");
                            showParaphrase(paraphrase);
                        }
                    }
                });


            }
        });
    }

    private void showParaphrase(Paraphrase paraphrase) {
        String title = paraphrase.getSimple().getQuery();
        String ph_en = paraphrase.getSimple().getWord().get(0).getUkphone();
        String ph_am = paraphrase.getSimple().getWord().get(0).getUsphone();
        mediaPlayer.reset();
        mediaPlayer1.reset();
        ph_en_mp3 = paraphrase.getLongman().getWordList().get(0).getEntry().getHead().get(0).getVIDEOCAL().get(0);
        ph_am_mp3 = paraphrase.getSplongman().getWordList().get(0).getEntry().getHead().get(0).getVIDEOCAL().get(0);


        if(title != null) {
            titleText.setText(title);
        }
        if(ph_en != null) {
            yb1.setText(ph_en);
        }else {
            yb1.setText("无");
        }
        if(ph_am != null) {
            yb2.setText(ph_am);
        }else {
            yb2.setText("无");
        }
        partsLayout.removeAllViews();
        if(paraphrase.getEc()!=null) {
            for (Paraphrase.EcBean.WordBean.TrsBean trsBean : paraphrase.getEc().getWord().get(0).getTrs()) {
                View view = LayoutInflater.from(this).inflate(R.layout.parts_item, partsLayout, false);
                TextView part = view.findViewById(R.id.part);
                part.setText(trsBean.getTr().get(0).getL().getI().get(0));
                partsLayout.addView(view);
            }
        } else {
            View view = LayoutInflater.from(this).inflate(R.layout.parts_item, partsLayout, false);
            TextView part = view.findViewById(R.id.part);
            part.setText("无");
            partsLayout.addView(view);
        }
        //
        changeLayout.removeAllViews();

        if(paraphrase.getRel_word() != null) {
            try {
                for (Paraphrase.RelWordBean.RelsBean relsBean : paraphrase.getRel_word().getRels()) {
                    View view = LayoutInflater.from(this).inflate(R.layout.change_item, changeLayout, false);
                    TextView part = view.findViewById(R.id.p);
                    TextView means = view.findViewById(R.id.c);
                    part.setText(relsBean.getRel().getPos() + " " + relsBean.getRel().getWords().get(0).getWord());
                    means.setText(relsBean.getRel().getWords().get(0).getTran());
                    changeLayout.addView(view);
                }
            }catch (NullPointerException e) {
                e.printStackTrace();
            }
        }else {
            View view = LayoutInflater.from(this).inflate(R.layout.change_item, changeLayout, false);
            TextView part = view.findViewById(R.id.p);
            part.setText("无");
            changeLayout.addView(view);
        }

        //
        sentenceLayout.removeAllViews();
        if(paraphrase.getBlng_sents_part()!=null) {
            for (Paraphrase.BlngSentsPartBean.SentencepairBean sentencepairBean : paraphrase.getBlng_sents_part().getSentencepair()) {
                View view = LayoutInflater.from(this).inflate(R.layout.sentence_item, sentenceLayout, false);
                TextView en = view.findViewById(R.id.en);
                TextView cn = view.findViewById(R.id.cn);
                if (en != null) {
                    en.setText(sentencepairBean.getSentence());
                }
                if (cn != null) {
                    cn.setText(sentencepairBean.getSentencetranslation());
                }
                sentenceLayout.addView(view);
            }
        }else {
            View view = LayoutInflater.from(this).inflate(R.layout.sentence_item, sentenceLayout, false);
            TextView part = view.findViewById(R.id.en);
            part.setText("无");
            sentenceLayout.addView(view);
        }

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mediaPlayer.isPlaying()) {
                    try {
                        if(ph_en_mp3!=null) {
                            mediaPlayer.setDataSource(ph_en_mp3);
                            mediaPlayer.prepare();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    }
                    mediaPlayer.start();
                }
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!mediaPlayer1.isPlaying()) {
                    try {
                        if (ph_am_mp3!=null) {
                            mediaPlayer1.setDataSource(ph_am_mp3);
                            mediaPlayer1.prepare();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (IllegalStateException e) {
                        e.printStackTrace();
                    }
                    mediaPlayer1.start();
                }
            }
        });

    }


}




