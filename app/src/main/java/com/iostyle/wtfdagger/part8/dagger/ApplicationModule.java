package com.iostyle.wtfdagger.part8.dagger;

import android.content.Context;

import com.iostyle.wtfdagger.App;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private App mApplication;

    public ApplicationModule(App mApplication) {
        this.mApplication = mApplication;
    }

    @PerApp
    @Named("Application")
    @Provides
    Context providerApplicationContext() {
        return mApplication.getApplicationContext();
    }
}
