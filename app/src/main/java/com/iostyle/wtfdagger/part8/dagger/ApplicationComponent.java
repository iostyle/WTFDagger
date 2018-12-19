package com.iostyle.wtfdagger.part8.dagger;

import android.content.Context;

import com.iostyle.wtfdagger.part9.dagger.SubComponent;

import javax.inject.Named;

import dagger.Component;

@PerApp
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @Named("Application")
    Context getApplication();

    //Part.9
    SubComponent subComponent();
}
