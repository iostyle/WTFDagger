package com.iostyle.wtfdagger.part2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.iostyle.wtfdagger.R;
import com.iostyle.wtfdagger.part2.bean.Joker;
import com.iostyle.wtfdagger.part2.dagger.DaggerSecondComponent;

import javax.inject.Inject;

public class Part2Act extends AppCompatActivity {

    @Inject
    Joker joker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        DaggerSecondComponent.create().inject(this);
        joker.init();
        joker.show();

    }
}
