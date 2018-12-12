package com.iostyle.wtfdagger.part4.dagger2;

import com.iostyle.wtfdagger.part4.Part4Act;

@dagger.Component(modules = Module.class)
public interface Component2 {
    void inject(Part4Act act);
}
