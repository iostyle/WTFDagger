package com.iostyle.wtfdagger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.iostyle.wtfdagger.part1.Part1Act;
import com.iostyle.wtfdagger.part2.Part2Act;
import com.iostyle.wtfdagger.part3.Part3Act;
import com.iostyle.wtfdagger.part4.Part4Act;
import com.iostyle.wtfdagger.part5.Part5Act;
import com.iostyle.wtfdagger.part6.Part6Act;
import com.iostyle.wtfdagger.part7.Part7Act;
import com.iostyle.wtfdagger.part8.Part8Act;
import com.iostyle.wtfdagger.part9.Part9Act;
import com.iostyle.wtfdagger.part10.Part10Act;
import com.simple.spiderman.SpiderMan;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.Module;

@Module
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SpiderMan.init(this);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this, Part1Act.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this, Part2Act.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(this, Part3Act.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(this, Part4Act.class));
                break;
            case R.id.btn5:
                startActivity(new Intent(this, Part5Act.class));
                break;
            case R.id.btn6:
                startActivity(new Intent(this, Part6Act.class));
                break;
            case R.id.btn7:
                startActivity(new Intent(this, Part7Act.class));
                break;
            case R.id.btn8:
                startActivity(new Intent(this, Part8Act.class));
                break;
            case R.id.btn9:
                startActivity(new Intent(this, Part9Act.class));
                break;
            case R.id.btn10:
                startActivity(new Intent(this, Part10Act.class));
                break;
        }
    }
}
