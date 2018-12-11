package com.iostyle.wtfdagger.part1.dagger;

import com.iostyle.wtfdagger.part1.Part1Act;

import dagger.Component;

/**
 * 组件 桥梁
 */
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(Part1Act activity);
}
