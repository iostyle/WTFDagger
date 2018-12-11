package com.iostyle.wtfdagger.part1.dagger;

import com.iostyle.wtfdagger.part1.bean.Sucker;

import dagger.Module;
import dagger.Provides;

/**
 * 模块
 */
@Module
class MainModule {
    @Provides
    Sucker providerSucker() {
        return new Sucker();
    }
}
