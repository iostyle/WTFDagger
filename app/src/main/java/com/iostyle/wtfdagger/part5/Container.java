package com.iostyle.wtfdagger.part5;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iostyle.wtfdagger.R;
import com.iostyle.wtfdagger.part5.dagger.ContextModule;
import com.iostyle.wtfdagger.part5.dagger.DaggerComponent;

import javax.inject.Inject;
import javax.inject.Named;

public class Container extends Fragment {

    @Named("Activity")
    @Inject
    Context mContext;

    @Named("Application")
    @Inject
    Context mAppContext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerComponent.builder().contextModule(new ContextModule(getActivity())).build().inject(this);
        Log.e("Dagger", mContext.toString());
        Log.e("Dagger", mAppContext.toString());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_common, container, false);
    }
}
