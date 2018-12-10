package com.example.lenovo.iciba;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lenovo.iciba.db.Word;
import com.example.lenovo.iciba.gson.Paraphrase;

import org.litepal.crud.DataSupport;

import java.util.ArrayList;
import java.util.List;

import static android.app.Activity.RESULT_OK;

public class IncFragment extends Fragment {
    private ArrayAdapter<String> adapter;
    private ListView listView;
    private List<String> dataList = new ArrayList<>();
    private String selectedAssociate1;
    private Word word1;
    private String selectedAssociate2;
    private List<Word> wordList;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.incfragment, container, false);
        listView = view.findViewById(R.id.list);
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, dataList);
        listView.setAdapter(adapter);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                wordList = DataSupport.findAll(Word.class);
                word1 = wordList.get(i);
                String text = word1.getInput();
//                selectedAssociate1 = dataList.get(i).toString().substring(0, dataList.get(i).toString().indexOf('\n'));
                Intent intent = new Intent();
                intent.putExtra("data_return1", text);
                startActivity(intent);
                getActivity().finish();
            }
        });
        queryWords();
    }

    @Override
    public void onStart() {
        super.onStart();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                wordList = DataSupport.findAll(Word.class);
                word1 = wordList.get(i);
                String text = word1.getInput();
//                selectedAssociate1 = dataList.get(i).toString().substring(0, dataList.get(i).toString().indexOf('\n'));
                Intent intent = new Intent(getActivity(),SecondActivity.class);
                intent.putExtra("data_return3", text);
                startActivity(intent);
            }
        });
        queryWords();
    }

    private void queryWords() {
        wordList = DataSupport.findAll(Word.class);
        if (wordList.size() > 0) {
            Log.d("6789","1");
//            Log.d("789",wordList.get(0).getEc().toString());
            dataList.clear();
            for (Word word : wordList) {

                if (word.getInput()!=null) {
                  //  Log.d("789",word.getSimple().getQuery() + " " + word.getEc().getWord().get(0).getTrs().get(0));
                    dataList.add(word.getInput()+ '\n' + word.getLang());
                    Log.d("789",dataList.toString());
                }else {
                    Log.d("789", "NULL");
                }
            }
            adapter.notifyDataSetChanged();
            listView.setSelection(0);
        }
    }

}