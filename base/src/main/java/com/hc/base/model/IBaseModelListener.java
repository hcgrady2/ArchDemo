package com.hc.base.model;

/**
 * Created by hcw  on 2020/5/30
 * 类描述：
 * all rights reserved
 */
public interface IBaseModelListener<T> {
    void onLoadFinish(MvvmBaseModel model, T data, PagingResult... pageResult);

    void onLoadFail(MvvmBaseModel model, String prompt, PagingResult... pageResult);
}