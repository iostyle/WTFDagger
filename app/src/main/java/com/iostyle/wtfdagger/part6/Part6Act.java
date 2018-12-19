package com.iostyle.wtfdagger.part6;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.iostyle.wtfdagger.App;
import com.iostyle.wtfdagger.R;
import com.iostyle.wtfdagger.part6.dagger.ActivityModule;
import com.iostyle.wtfdagger.part6.dagger.DaggerActivityComponent;

import javax.inject.Inject;

public class Part6Act extends AppCompatActivity {

    /**
     * 这里注入的对象可以由ActivityComponent提供，
     * 也可由ApplicationComponent提供
     */
    @Inject
//    @ContextLife("Application")
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        DaggerActivityComponent.builder()
                .applicationComponent(App.part6Component)
                .activityModule(new ActivityModule(this))
                .build().inject(this);
        Log.e("Dagger", context.toString());
    }
}
