package com.iostyle.wtfdagger.part3.bean;

import android.util.Log;

import com.iostyle.wtfdagger.part2.dagger.DaggerSecondComponent;

import javax.inject.Inject;

public class Joker {
    private static final String TAG = "JOKER";

    Faker faker;

    public Joker(Faker faker) {
        this.faker = faker;
    }

    public void show() {
        if (faker != null) faker.show();
        else Log.e(TAG, ": )");
    }
}
