package com.hc.base.model;

/**
 * Created by hcw  on 2020/5/30
 * 类描述：
 * all rights reserved
 */
public interface MvvmNetworkObserver<F> {
    void onSuccess(F t, boolean isFromCache);
    void onFailure(Throwable e);
}
