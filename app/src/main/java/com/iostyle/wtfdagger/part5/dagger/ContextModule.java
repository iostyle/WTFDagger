package com.iostyle.wtfdagger.part5.dagger;

import android.content.Context;

import com.iostyle.wtfdagger.App;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context mContext;
    private Context mAppContext = App.getContext();

    public ContextModule(Context context) {
        this.mContext = context;
    }

    /**
     * 如果多个provider的返回值类型相同就不能再通过返回值类型去判断该调用哪个方法了
     * 这个时候可以为相同返回值的provider方法进行命名
     * 在注入的时候添加上名字即可
     */

    @Named("Activity")
    @Provides
    Context providerContext() {
        return mContext;
    }

    @Named("Application")
    @Provides
    Context providerAppContext() {
        return mAppContext;
    }


}
