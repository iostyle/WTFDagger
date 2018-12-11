package com.iostyle.wtfdagger.part2.dagger;

import com.iostyle.wtfdagger.part2.bean.Faker;
import com.iostyle.wtfdagger.part2.bean.Joker;

import dagger.Module;
import dagger.Provides;

@Module
public class SecondModule {

    @Provides
    Faker providerFaker(){
        return new Faker();
    }

    @Provides
    Joker providerJoker(){
        return new Joker();
    }
}
