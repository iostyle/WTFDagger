package com.iostyle.wtfdagger.part5;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.iostyle.wtfdagger.R;

public class Part5Act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        getSupportFragmentManager().beginTransaction().replace(R.id.root, new Container()).commit();
    }
}
