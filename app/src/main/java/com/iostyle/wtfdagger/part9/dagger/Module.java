package com.iostyle.wtfdagger.part9.dagger;

import com.iostyle.wtfdagger.part9.bean.Tester;

import dagger.Provides;

@dagger.Module
public class Module {
    @Provides
    Tester providerTester(){
        return new Tester();
    }
}
