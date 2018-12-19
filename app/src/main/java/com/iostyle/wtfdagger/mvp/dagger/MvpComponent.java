package com.iostyle.wtfdagger.mvp.dagger;

import com.iostyle.wtfdagger.mvp.ShopListActivity;

import dagger.Component;

@Component(modules = MvpModule.class)
public interface MvpComponent {
    void inject(ShopListActivity act);
}
