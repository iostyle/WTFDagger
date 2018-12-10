package com.iostyle.wtfdagger.dagger;

import com.iostyle.wtfdagger.MainActivity;

import dagger.Component;

/**
 * 组件 桥梁
 */
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
