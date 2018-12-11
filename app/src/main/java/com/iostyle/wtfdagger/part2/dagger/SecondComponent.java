package com.iostyle.wtfdagger.part2.dagger;

import com.iostyle.wtfdagger.part2.Part2Act;
import com.iostyle.wtfdagger.part2.bean.Joker;

import dagger.Component;

@Component(modules = {SecondModule.class})
public interface SecondComponent {
    void inject(Joker joker);
    void inject(Part2Act act);
}
