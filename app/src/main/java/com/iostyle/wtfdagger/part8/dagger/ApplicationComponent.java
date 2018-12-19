package com.iostyle.wtfdagger.part8.dagger;

import android.content.Context;

import javax.inject.Named;

import dagger.Component;

@PerApp
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @Named("Application")
    Context getApplication();
}
