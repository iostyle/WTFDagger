package com.iostyle.wtfdagger.part7.dagger;

import com.iostyle.wtfdagger.part7.bean.Hero;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class HeroModule {
    @Singleton
    @Provides
    Hero providerHero() {
        return new Hero();
    }
}
