package com.example.lenovo.recyclerviewdemo.util;

import android.util.Log;

import com.example.lenovo.recyclerviewdemo.gson.Newshot;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Utility {
    public static Newshot handleNewshotResponse(String response) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.fromJson(response, new TypeToken<Newshot>() {}.getType());
    }
}
