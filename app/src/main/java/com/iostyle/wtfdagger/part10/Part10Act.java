package com.iostyle.wtfdagger.part10;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.iostyle.wtfdagger.R;
import com.iostyle.wtfdagger.part10.bean.Idler;
import com.iostyle.wtfdagger.part10.dagger.DaggerComponent;
import com.iostyle.wtfdagger.part5.Container;

import javax.inject.Inject;

import dagger.Lazy;

public class Part10Act extends AppCompatActivity {
    /**
     * Lazy定义的对象 只有在调用.get()时 才会注入
     */
    @Inject
    Lazy<Idler> idlerLazy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        DaggerComponent.create().inject(this);
        idlerLazy.get().talk();
    }
}
