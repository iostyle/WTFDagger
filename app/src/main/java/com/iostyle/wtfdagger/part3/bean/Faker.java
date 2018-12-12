package com.iostyle.wtfdagger.part3.bean;

import android.util.Log;

import javax.inject.Inject;

public class Faker {
    private final static String TAG = "FAKER";

    public void show() {
        Log.e(TAG, "^ ^");
    }

    @Inject
    public Faker() {
    }
}
