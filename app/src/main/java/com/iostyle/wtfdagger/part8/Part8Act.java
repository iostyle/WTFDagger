package com.iostyle.wtfdagger.part8;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;

import com.iostyle.wtfdagger.R;
import com.iostyle.wtfdagger.part5.Container;

import javax.inject.Inject;
import javax.inject.Named;

public class Part8Act extends Part8BaseActivity {

    @Inject
//    @Named("Application")
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        getActivityComponent().inject(this);
        Log.e("Dagger", context.toString());
    }
}
