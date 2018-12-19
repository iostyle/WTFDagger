package com.iostyle.wtfdagger.part6.dagger;

import android.content.Context;

import com.iostyle.wtfdagger.App;
import com.iostyle.wtfdagger.part5.dagger.ContextLife;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private App mApplication;

    public ApplicationModule(App application) {
        mApplication = application;
    }

    @Provides
    @ContextLife("Application")
    public Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }
}

