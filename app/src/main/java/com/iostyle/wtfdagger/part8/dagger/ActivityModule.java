package com.iostyle.wtfdagger.part8.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private Context context;

    public ActivityModule(Context context) {
        this.context = context;
    }

    @PerAct
    @Provides
    Context providerActivityContext() {
        return context;
    }
}
