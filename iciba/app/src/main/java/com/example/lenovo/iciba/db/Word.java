package com.example.lenovo.iciba.db;

import com.google.gson.annotations.SerializedName;

import org.litepal.crud.DataSupport;

import java.io.Serializable;
import java.util.List;

public class Word extends DataSupport implements Serializable{

    private String input;
    private String lang;
    private String le;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLe() {
        return le;
    }

    public void setLe(String le) {
        this.le = le;
    }
}
