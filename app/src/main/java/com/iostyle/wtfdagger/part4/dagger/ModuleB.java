package com.iostyle.wtfdagger.part4.dagger;

import com.iostyle.wtfdagger.part4.bean.B;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleB {
    @Provides
    B providerB(){
        return new B();
    }
}
