package com.bawei.liyizhi0806.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.bawei.liyizhi0806.R;
import com.bawei.liyizhi0806.model.bean.PersonBean;
import com.bawei.liyizhi0806.presenter.HomePresenter;
import com.bawei.liyizhi0806.view.adapter.MyAdapter;
import com.bawei.liyizhi0806.view.interfaces.IMainView;

import java.util.List;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/6<p>
 * <p>更改时间：2019/8/6<p>
 */
public class MainActivity extends BaseActivity implements IMainView.DATASHUJV {


    private ListView listView;
    private HomePresenter presenter;
    private List<PersonBean.DataBean> data;

    @Override
    int onLayout() {
        return R.layout.activity_main;
    }

    @Override
    void initView() {
        listView = findViewById(R.id.listview);
    }

    @Override
    void initData() {
        presenter = new HomePresenter();
        presenter.HomePresenter();
        presenter.ActachView(this);
    }

    @Override
    public void success(PersonBean personBean) {
        Log.e("TAG", "success: "+personBean );
        data = personBean.getData();
        MyAdapter adapter=new MyAdapter(data,this);
        listView.setAdapter(adapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.DatachView();
    }
}