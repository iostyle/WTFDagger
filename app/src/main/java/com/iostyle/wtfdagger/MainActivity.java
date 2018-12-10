package com.iostyle.wtfdagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iostyle.wtfdagger.bean.Sucker;
import com.iostyle.wtfdagger.dagger.DaggerMainComponent;
import com.simple.spiderman.SpiderMan;

import javax.inject.Inject;

import dagger.Module;

@Module
public class MainActivity extends AppCompatActivity {

    @Inject
    Sucker sucker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SpiderMan.init(this);

//        DaggerMainComponent.create().inject(this);
        DaggerMainComponent.builder().build().inject(this);

        sucker.eat();
    }
}
