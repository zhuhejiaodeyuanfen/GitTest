package com.vivian.mygit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new GitA();
        new GitB();
        new GitC();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("我是王亚军 我也要修改东西");
        new TestA();
        get();
        new TestB();
        println(ID_GET);
    }

    private void get() {
        System.out.println("我是王亚军 我也要修改东西");
    }


    private void println(String str) {
        System.out.println("我是王亚军 我也要修改东西" + str);
    }

    public static final String ID_GET = "222";
}
