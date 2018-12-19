package com.iostyle.wtfdagger.part9;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.iostyle.wtfdagger.App;
import com.iostyle.wtfdagger.R;
import com.iostyle.wtfdagger.part9.bean.Tester;

import javax.inject.Inject;
import javax.inject.Named;

public class Part9Act extends AppCompatActivity {
    @Inject
    @Named("Application")
    Context context;

    @Inject
    Tester tester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        App.getApplicationComponent().subComponent().inject(this);
        Log.e("Dagger", context.toString());
        tester.test();
    }
}
