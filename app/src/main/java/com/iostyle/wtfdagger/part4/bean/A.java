package com.iostyle.wtfdagger.part4.bean;

import android.util.Log;

public class A {

    private String str = "A";

    public A() {
    }

    public A(String str) {
        this.str = str;
    }

    public void show() {
        Log.e("Dagger", str);
    }
}
