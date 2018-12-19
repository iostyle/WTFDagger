package com.iostyle.wtfdagger.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.iostyle.wtfdagger.R;
import com.iostyle.wtfdagger.mvp.bean.Goods;
import com.iostyle.wtfdagger.mvp.dagger.DaggerMvpComponent;
import com.iostyle.wtfdagger.mvp.dagger.MvpModule;
import com.iostyle.wtfdagger.mvp.presenter.ShopListPresenter;
import com.iostyle.wtfdagger.mvp.view.ShopListView;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

public class ShopListActivity extends AppCompatActivity implements ShopListView {

//    @Inject
//    Context context;

    @Inject
    ShopListPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
//        DaggerMvpComponent.builder().mvpModule(new MvpModule(this)).build().inject(this);
//        Log.e("Dagger", context.toString());
//        mPresenter.attach(this);
//        mPresenter.loadData();
        DaggerMvpComponent.builder().mvpModule(new MvpModule(this)).build().inject(this);
        mPresenter.loadData();
    }

    @Override
    public void bindData(List<Goods> goodsList) {
        Iterator<Goods> iterator = goodsList.iterator();
        while (iterator.hasNext()) {
            iterator.next().show();
        }
    }
}
