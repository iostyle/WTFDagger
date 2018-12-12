package com.iostyle.wtfdagger.part3.dagger;

import com.iostyle.wtfdagger.part3.Part3Act;

import dagger.Component;

@Component(modules = {ThirdModule.class})
public interface ThirdComponent {
    void inject(Part3Act act);
}
