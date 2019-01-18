package com.example.lenovo.recyclerviewdemo.util;

import android.util.Log;

import com.example.lenovo.recyclerviewdemo.gson.Newshot;
import com.example.lenovo.recyclerviewdemo.gson.Newstech;
import com.example.lenovo.recyclerviewdemo.gson.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class Utility {
    public static Newshot handleNewshotResponse(String response) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.fromJson(response, new TypeToken<Newshot>() {}.getType());
    }
    public static Newstech handleNewstechResponse(String response) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.fromJson(response, new TypeToken<Newstech>() {}.getType());
    }
    public static User handleUserResponse(String response) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        return gson.fromJson(response, new TypeToken<User>() {}.getType());
    }
}
