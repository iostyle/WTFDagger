package com.iostyle.wtfdagger.part10.dagger;

import com.iostyle.wtfdagger.part10.bean.Idler;

import dagger.Provides;

@dagger.Module
public class Module {
    @Provides
    Idler providerIdler() {
        return new Idler();
    }
}
