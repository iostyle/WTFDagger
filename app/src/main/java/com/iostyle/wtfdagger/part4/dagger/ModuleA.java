package com.iostyle.wtfdagger.part4.dagger;

import com.iostyle.wtfdagger.part4.bean.A;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleA {

    A a = new A();

    @Provides
    A providerA() {
        return a;
    }

    public ModuleA() {

    }

    public ModuleA(String str) {
        a = new A(str);
    }

}
