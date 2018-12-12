package com.iostyle.wtfdagger.part3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.iostyle.wtfdagger.R;
import com.iostyle.wtfdagger.part3.bean.Joker;
import com.iostyle.wtfdagger.part3.dagger.DaggerThirdComponent;
import com.iostyle.wtfdagger.part3.dagger.ThirdComponent;

import javax.inject.Inject;

public class Part3Act extends AppCompatActivity {

    @Inject
    Joker joker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        DaggerThirdComponent.create().inject(this);

        joker.show();

    }
}
