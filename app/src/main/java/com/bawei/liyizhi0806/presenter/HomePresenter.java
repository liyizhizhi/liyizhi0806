package com.bawei.liyizhi0806.presenter;

import com.bawei.liyizhi0806.model.bean.PersonBean;
import com.bawei.liyizhi0806.model.contran.CaoJie;
import com.bawei.liyizhi0806.model.http.HttpUtils;
import com.bawei.liyizhi0806.view.interfaces.IMainView;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/6<p>
 * <p>更改时间：2019/8/6<p>
 */
public class HomePresenter <V extends IMainView.DATASHUJV>  extends BasePresenter<V>{

    public void HomePresenter() {
        HttpUtils.getInstance().getdata(CaoJie.BAS_DATA, new HttpUtils.CallBackData() {
            @Override
            public void ok(PersonBean personBean) {
                getView().success(personBean);
            }
        });
    }
}
