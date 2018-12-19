package com.iostyle.wtfdagger.part10.dagger;

import com.iostyle.wtfdagger.part10.Part10Act;

@dagger.Component(modules = Module.class)
public interface Component {
    void inject(Part10Act act);
}
