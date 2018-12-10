package com.example.lenovo.iciba.db;

import org.litepal.crud.DataSupport;

public class Listword extends DataSupport {
    private String wordname;

    public String getWordname() {
        return wordname;
    }

    public void setWordname(String wordname) {
        this.wordname = wordname;
    }


}
