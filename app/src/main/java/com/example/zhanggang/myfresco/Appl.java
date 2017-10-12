package com.example.zhanggang.myfresco;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by zhanggang on 2017/10/12.
 */

public class Appl extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化Fresco类
        Fresco.initialize(this);
    }
}
