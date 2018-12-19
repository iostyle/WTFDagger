package com.iostyle.wtfdagger;

import android.app.Application;
import android.content.Context;

import com.iostyle.wtfdagger.part6.dagger.ApplicationComponent;
import com.iostyle.wtfdagger.part6.dagger.ApplicationModule;
import com.iostyle.wtfdagger.part6.dagger.DaggerApplicationComponent;

public class App extends Application {
    private static Context mContext;
    public static ApplicationComponent part6Component;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        part6Component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public static Context getContext() {
        return mContext;
    }
}
