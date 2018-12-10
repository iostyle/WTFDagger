package com.iostyle.wtfdagger.dagger;

import com.iostyle.wtfdagger.bean.Sucker;

import dagger.Module;
import dagger.Provides;

/**
 * 模块
 */
@Module
public class MainModule {
    @Provides
    Sucker providerSucker() {
        return new Sucker();
    }
}
