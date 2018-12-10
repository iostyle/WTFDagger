package com.iostyle.wtfdagger.dagger;

import android.support.v7.app.AppCompatActivity;

import dagger.Component;

/**
 * 组件
 */
@Component
public interface MainComponent {
    void inject(AppCompatActivity activity);
}
