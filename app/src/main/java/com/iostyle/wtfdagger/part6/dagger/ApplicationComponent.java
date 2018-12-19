package com.iostyle.wtfdagger.part6.dagger;

import android.content.Context;

import com.iostyle.wtfdagger.App;
import com.iostyle.wtfdagger.part5.dagger.ContextLife;

import dagger.Component;

@Component(modules={ApplicationModule.class})
public interface ApplicationComponent{
    /**
     * 对外提供ContextLife类型为"Application"的Context
     */
    @ContextLife("Application")
    public Context getApplication();
}
