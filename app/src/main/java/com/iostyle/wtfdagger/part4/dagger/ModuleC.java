package com.iostyle.wtfdagger.part4.dagger;

import com.iostyle.wtfdagger.part4.bean.C;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleC {
    @Provides
    C providerC(){
        return new C();
    }
}
