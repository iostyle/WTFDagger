package com.iostyle.wtfdagger.part2.bean;

import android.util.Log;

import com.iostyle.wtfdagger.part2.dagger.DaggerSecondComponent;

import javax.inject.Inject;

public class Joker {
    private static final String TAG = "JOKER";

    @Inject
    Faker faker;

    public void init() {
        DaggerSecondComponent.create().inject(this);
    }

    public void show() {
        if (faker != null) faker.show();
        else Log.e(TAG, ": )");
    }
}
