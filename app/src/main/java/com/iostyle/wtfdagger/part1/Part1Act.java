package com.iostyle.wtfdagger.part1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.iostyle.wtfdagger.R;
import com.iostyle.wtfdagger.part1.bean.Sucker;
import com.iostyle.wtfdagger.part1.dagger.DaggerMainComponent;

import javax.inject.Inject;

public class Part1Act extends AppCompatActivity {

    @Inject
    Sucker sucker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

//        DaggerMainComponent.create().inject(this);
        DaggerMainComponent.builder().build().inject(this);

        sucker.eat();
    }
}
