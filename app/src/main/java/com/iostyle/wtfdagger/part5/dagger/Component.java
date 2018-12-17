package com.iostyle.wtfdagger.part5.dagger;

import com.iostyle.wtfdagger.part5.Container;

@dagger.Component(modules = ContextModule.class)
public interface Component {
    void inject(Container container);
}
