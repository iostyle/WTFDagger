package com.iostyle.wtfdagger.part8;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.iostyle.wtfdagger.App;
import com.iostyle.wtfdagger.part8.dagger.ActivityComponent;
import com.iostyle.wtfdagger.part8.dagger.ActivityModule;
import com.iostyle.wtfdagger.part8.dagger.DaggerActivityComponent;

public class Part8BaseActivity extends AppCompatActivity {
    protected ActivityComponent activityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityComponent = DaggerActivityComponent.builder()
                .applicationComponent(App.getApplicationComponent())
                .activityModule(new ActivityModule(this))
                .build();
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }
}
