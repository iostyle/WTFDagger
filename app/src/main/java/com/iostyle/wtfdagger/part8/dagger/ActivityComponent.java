package com.iostyle.wtfdagger.part8.dagger;

import com.iostyle.wtfdagger.part8.Part8Act;

import dagger.Component;

@Component(modules = ActivityModule.class, dependencies = ApplicationComponent.class)
@PerAct
public interface ActivityComponent {
    void inject(Part8Act act);
}
