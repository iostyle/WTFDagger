package com.iostyle.wtfdagger.mvp.presenter;

import com.iostyle.wtfdagger.mvp.bean.Goods;
import com.iostyle.wtfdagger.mvp.view.ShopListView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class ShopListPresenter {
    ShopListView mView;

    /**
     * 我们并没有在Module中提供生产Presenter实例的Provides方法。
     * 这时根据Dagger2的注入规则，
     * 用@Inject注释的成员变量的依赖 会首先从Module的@Provides方法集合中查找。
     * 如果查找不到的话，则会查找成员变量类型是否有@Inject构造方法，
     * 并会调用该构造方法注入该类型的成员变量。
     * 这时如果被@Inject注释的构造方法有参数的话，则将会继续使用注入规则进行递归查找。
     */
//    @Inject
//    public ShopListPresenter() {
//    }

    /**
     * 直接把View作为参数传递进来
     * 注入的时候会去Module里寻找 @Provider
     */
    @Inject
    public ShopListPresenter(ShopListView mView) {
        this.mView = mView;
    }

    public void attach(ShopListView view) {
        this.mView = view;
    }

    public void loadData() {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("啤酒"));
        goodsList.add(new Goods("饮料"));
        goodsList.add(new Goods("矿泉水"));
        goodsList.add(new Goods("花生"));
        goodsList.add(new Goods("瓜子"));
        goodsList.add(new Goods("方便面"));
        if (this.mView != null)
            this.mView.bindData(goodsList);
    }
}
