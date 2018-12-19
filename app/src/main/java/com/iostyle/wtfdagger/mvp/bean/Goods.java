package com.iostyle.wtfdagger.mvp.bean;

import android.util.Log;

public class Goods {
    private String name;

    public Goods(String name) {
        this.name = name;
    }

    public void show() {
        Log.e("Goods", name);
    }
}
