package com.bawei.liyizhi0806.model.app;

import android.app.Application;
import android.content.Context;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/6<p>
 * <p>更改时间：2019/8/6<p>
 */
public class App  extends Application {

    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
    context=this;
    }
}
