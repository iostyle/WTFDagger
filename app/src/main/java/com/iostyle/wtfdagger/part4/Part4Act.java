package com.iostyle.wtfdagger.part4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.iostyle.wtfdagger.R;
import com.iostyle.wtfdagger.part4.bean.A;
import com.iostyle.wtfdagger.part4.bean.B;
import com.iostyle.wtfdagger.part4.bean.C;
import com.iostyle.wtfdagger.part4.dagger.DaggerComponent;
import com.iostyle.wtfdagger.part4.dagger.ModuleA;
import com.iostyle.wtfdagger.part4.dagger2.DaggerComponent2;

import javax.inject.Inject;

public class Part4Act extends AppCompatActivity {
    @Inject
    A a;
    @Inject
    B b;
    @Inject
    C c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

//        DaggerComponent.create().inject(this);
        /**
         * DaggerComponent默认构造无参的Module
         */
//        DaggerComponent.builder().build().inject(this);
        /**
         * 但可以单独传入重载的Module
         */
//        DaggerComponent.builder().moduleA(new ModuleA("AA")).build().inject(this);
//        a.show();
//        b.show();
//        c.show();

        /**
         * 同样的，另外一种多module方式也可以这样使用
         */
        DaggerComponent2.builder().moduleA(new ModuleA("AA")).build().inject(this);
        a.show();
        b.show();
        c.show();
    }
}
