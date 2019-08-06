package com.bawei.liyizhi0806.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/6<p>
 * <p>更改时间：2019/8/6<p>
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   setContentView(onLayout());
   initView();
   initData();
    }

    abstract int onLayout();
    abstract void initView();
    abstract void initData();
}
