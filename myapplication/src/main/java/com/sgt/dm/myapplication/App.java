package com.sgt.dm.myapplication;

import android.app.Application;
import android.content.Context;
//import android.support.multidex.MultiDex;

/*
-----------------------------------------------------------------------------------
Software: CameraOTG-master
Version: 1.0.0
-----------------------------------------------------------------------------------
Company: 浙江易时科技股份有限公司
Copyright (c) 2016, http://http://eastime.com.cn/. All Rights Reserved.
-----------------------------------------------------------------------------------
@author sunguotao
@time 2018/5/15 08:39
-----------------------------------------------------------------------------------
*/public class App extends Application{
    @Override
    public void onCreate() {
//        MultiDex.install(this);
        super.onCreate();
    }
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
//        MultiDex.install(this);
    }
}
