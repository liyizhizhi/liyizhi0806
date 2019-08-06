package com.bawei.liyizhi0806.view.interfaces;

import com.bawei.liyizhi0806.model.bean.PersonBean;

/**
 * <p>文件描述：<p>
 * <p>作者：黎怡志<p>
 * <p>创建时间：2019/8/6<p>
 * <p>更改时间：2019/8/6<p>
 */
public interface IMainView {

    interface DATASHUJV extends IBaseView {
        void  success(PersonBean personBean);
    }
}
