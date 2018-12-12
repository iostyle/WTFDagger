package com.iostyle.wtfdagger.part4.dagger;


import com.iostyle.wtfdagger.part4.Part4Act;

/**
 * Component添加多Module的两种方式
 */
@dagger.Component(modules = {ModuleA.class, ModuleB.class, ModuleC.class})
public interface Component {
    void inject(Part4Act act);
}
