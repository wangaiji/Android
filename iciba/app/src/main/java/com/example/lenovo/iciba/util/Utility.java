package com.example.lenovo.iciba.util;

import android.util.Log;

import com.example.lenovo.iciba.db.Word;
import com.example.lenovo.iciba.gson.Associate;
import com.example.lenovo.iciba.gson.Paraphrase;
import com.example.lenovo.iciba.gson.Translate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class Utility {

    /**
     * 将返回的JSON数据解析成实体类
     */
    public static Associate handleAssociateResponse(String response) {
        Log.d("123456","1");
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.fromJson(response, Associate.class);
    }

    public static Paraphrase handleParaphraseResponse(String response) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.fromJson(response, new TypeToken<Paraphrase>() {}.getType());
    }

    public static Translate handleTranslateResponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            String translateContent = jsonObject.toString();
            return new Gson().fromJson(translateContent, Translate.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
