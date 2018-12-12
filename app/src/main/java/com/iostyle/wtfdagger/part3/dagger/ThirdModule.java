package com.iostyle.wtfdagger.part3.dagger;

import com.iostyle.wtfdagger.part3.bean.Faker;
import com.iostyle.wtfdagger.part3.bean.Joker;

import dagger.Module;
import dagger.Provides;

@Module
public class ThirdModule {
    /**
     * 有参数的provider inject的时候会在相同Module下寻找参数的provider
     * 如果找不到，则会寻找参数添加@Inject的构造方法
     */
    @Provides
    Joker providerJoker(Faker faker) {
        return new Joker(faker);
    }

//    @Provides
//    Faker providerFaker() {
//        return new Faker();
//    }
}
