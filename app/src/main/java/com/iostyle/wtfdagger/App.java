package com.iostyle.wtfdagger;

import android.app.Application;
import android.content.Context;

import com.iostyle.wtfdagger.part6.dagger.ApplicationComponent;
import com.iostyle.wtfdagger.part6.dagger.ApplicationModule;
import com.iostyle.wtfdagger.part6.dagger.DaggerApplicationComponent;

public class App extends Application {
    private static Context mContext;
    public static ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public static Context getContext() {
        return mContext;
    }
}
