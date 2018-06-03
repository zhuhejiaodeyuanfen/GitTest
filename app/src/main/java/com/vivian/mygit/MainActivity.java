package com.vivian.mygit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import junit.framework.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("我是王亚军 我也要修改东西");
        new TestA();
        new TestB();
    }
}
