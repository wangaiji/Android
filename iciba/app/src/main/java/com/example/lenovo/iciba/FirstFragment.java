package com.example.lenovo.iciba;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.iciba.db.Listword;
import com.example.lenovo.iciba.db.Word;
import com.example.lenovo.iciba.gson.Paraphrase;

import com.example.lenovo.iciba.gson.Translate;
import com.example.lenovo.iciba.util.HttpUtil;
import com.example.lenovo.iciba.util.Utility;

import org.litepal.crud.DataSupport;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

import static android.app.Activity.RESULT_OK;

public class FirstFragment extends Fragment{
    private TextView titleText;
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private TextView yb1;
    private TextView yb2;
    private TextView text2;
    private LinearLayout changeLayout;
    private LinearLayout partsLayout;
    private LinearLayout sentenceLayout;
    private ImageButton search_button;
    private ImageButton inc_button;
    private MediaPlayer mediaPlayer = new MediaPlayer();
    private MediaPlayer mediaPlayer1 = new MediaPlayer();
    private String ph_en_mp3;
    private String ph_am_mp3;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.firstfragment,container,false);
        titleText = view.findViewById(R.id.dc_text);
        imageButton1 = view.findViewById(R.id.image_btn_dict_horn_accent_eng);
        imageButton2 = view.findViewById(R.id.image_btn_dict_horn_accent_usa);
        yb1 = view.findViewById(R.id.text_dict_phosymbol_eng);
        yb2 = view.findViewById(R.id.text_dict_phosymbol_usa);
        partsLayout = view.findViewById(R.id.parts_layout);
        sentenceLayout = view.findViewById(R.id.sentence_layout);
        changeLayout = view.findViewById(R.id.change_layout);
        search_button = view.findViewById(R.id.search_button);
        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),ListActivity.class);
                startActivityForResult(intent,1);
            }
        });

        inc_button = view.findViewById(R.id.inc);
//        inc_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(),"已添加到生词本",Toast.LENGTH_SHORT).show();
//
//
//            }
//        });
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return1");
                    Log.d("6789",returnedData);
                    if(returnedData.charAt(0)<=255&&returnedData.charAt(0)>=0) {
                        requestParaphrase(returnedData);
                    }else{
                        requestParaphrase(data.getStringExtra("data_return2"));
                    }
                }

                break;
            default:
        }

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("123x","9");
        requestParaphrase("account");
        Log.d("123x","8");
    }




    /**
     * 请求信息
     */

    public void requestParaphrase(final String word) {
        String paraphraseUrl = "http://dict.youdao.com/jsonapi?xmlVersion=5.1&client=&q="+word+"&dicts=&keyfrom=&model=&mid=&imei=&vendor=&screen=&ssid=&network=5g&abtest=&jsonversion=2";
        HttpUtil.sendOkHttpRequest(paraphraseUrl, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d("1234567","3");
                e.printStackTrace();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getContext(), "获取单词失败", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.d("123","2");
                final String responseText = response.body().string();
                Log.d("123","4");
                Log.d("123",responseText);
                final Paraphrase paraphrase = Utility.handleParaphraseResponse(responseText);

                Listword listword = new Listword();
                listword.setWordname(paraphrase.getInput());
//                listword.save();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("123","3");
                        if(paraphrase == null) {
                            Log.d("123", "null");
                        }

                        if (paraphrase != null) {
                            Log.d("123","1");
                            showParaphrase(paraphrase);
                        }
                    }
                });

                inc_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(),"已添加到生词本",Toast.LENGTH_SHORT).show();
                        Word word1 = new Word();

                        word1.setInput(paraphrase.getInput());
                        word1.setLang(paraphrase.getEc().getWord().get(0).getTrs().get(0).getTr().get(0).getL().getI().get(0));
                        word1.save();
//                        List<Word> wordsList = DataSupport.findAll(Word.class);
//                        for (Word word : wordsList) {
//                            Log.d("789litepal", word.toString());
//                        }
//                        Log.d("2678",responseText);
       //                 Log.d("2678",word1.toString());
//                        word1.save();

                    }
                });

            }
        });
    }

    public void requestTranslate(final String w) {
        String translateUrl = "http://fy.iciba.com/ajax.php?a=fy&f=auto&t=auto&w=" + w + "%20world";
        HttpUtil.sendOkHttpRequest(translateUrl, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getContext(), "获取单词失败", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText = response.body().string();
                final Translate translate = Utility.handleTranslateResponse(responseText);
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (translate != null ) {
                            showTranslate(translate);
                        }
                    }
                });
            }
        });
    }

    /**
     * 展示数据
     */


    private void showParaphrase(Paraphrase paraphrase) {
        String title = paraphrase.getSimple().getQuery();
        String ph_en = paraphrase.getSimple().getWord().get(0).getUkphone();
        String ph_am = paraphrase.getSimple().getWord().get(0).getUsphone();
        mediaPlayer.reset();
        mediaPlayer1.reset();
        if(paraphrase.getLongman() != null) {
            ph_en_mp3 = paraphrase.getLongman().getWordList().get(0).getEntry().getHead().get(0).getVIDEOCAL().get(0);
        }
        if(paraphrase.getSplongman() != null) {
            ph_am_mp3 = paraphrase.getSplongman().getWordList().get(0).getEntry().getHead().get(0).getVIDEOCAL().get(0);
        }


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
                View view = LayoutInflater.from(getContext()).inflate(R.layout.parts_item, partsLayout, false);
                TextView part = view.findViewById(R.id.part);
                part.setText(trsBean.getTr().get(0).getL().getI().get(0));
                partsLayout.addView(view);
            }
        } else {
            View view = LayoutInflater.from(getContext()).inflate(R.layout.parts_item, partsLayout, false);
            TextView part = view.findViewById(R.id.part);
            part.setText("无");
            partsLayout.addView(view);
        }
        //
        changeLayout.removeAllViews();

        if(paraphrase.getRel_word() != null) {
            try {
                for (Paraphrase.RelWordBean.RelsBean relsBean : paraphrase.getRel_word().getRels()) {
                    View view = LayoutInflater.from(getContext()).inflate(R.layout.change_item, changeLayout, false);
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
            View view = LayoutInflater.from(getContext()).inflate(R.layout.change_item, changeLayout, false);
            TextView part = view.findViewById(R.id.p);
            part.setText("无");
            changeLayout.addView(view);
        }

        //
        sentenceLayout.removeAllViews();
        if(paraphrase.getBlng_sents_part()!=null) {
            for (Paraphrase.BlngSentsPartBean.SentencepairBean sentencepairBean : paraphrase.getBlng_sents_part().getSentencepair()) {
                View view = LayoutInflater.from(getContext()).inflate(R.layout.sentence_item, sentenceLayout, false);
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
            View view = LayoutInflater.from(getContext()).inflate(R.layout.sentence_item, sentenceLayout, false);
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



    private void showTranslate(Translate translate) {

    }
}
