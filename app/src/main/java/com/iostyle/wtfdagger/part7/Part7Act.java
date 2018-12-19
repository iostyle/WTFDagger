package com.iostyle.wtfdagger.part7;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.iostyle.wtfdagger.R;
import com.iostyle.wtfdagger.part5.Container;
import com.iostyle.wtfdagger.part7.bean.Hero;
import com.iostyle.wtfdagger.part7.dagger.DaggerHeroComponent;

import javax.inject.Inject;

public class Part7Act extends AppCompatActivity {

    @Inject
    Hero hero;
    @Inject
    Hero cloned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        DaggerHeroComponent.create().inject(this);
        hero.yell();
        /**
         * 这里如果不做延迟处理 log只会打印一条
         * 我猜测是log内部实现原因 需要一定的间隔时间
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    cloned.yell();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
