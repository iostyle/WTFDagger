package com.iostyle.wtfdagger.part6.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    Context context;

//    public ActivityModule() {
//    }

    public ActivityModule(Context context) {
        this.context = context;
    }

    @Provides
    Context providerContext() {
        return context;
    }
}
