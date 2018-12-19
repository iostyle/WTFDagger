package com.iostyle.wtfdagger.mvp.dagger;

import android.content.Context;

import com.iostyle.wtfdagger.mvp.view.ShopListView;

import dagger.Module;
import dagger.Provides;

@Module
public class MvpModule {
//    Context context;

//    public MvpModule(Context context) {
//        this.context = context;
//    }

//    @Provides
//    Context providerContext() {
//        return context;
//    }

    ShopListView view;

    public MvpModule(ShopListView view) {
        this.view = view;
    }

    @Provides
    ShopListView providerView() {
        return view;
    }
}
