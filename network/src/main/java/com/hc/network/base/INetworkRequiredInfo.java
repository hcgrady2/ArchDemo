package com.hc.network.base;

import android.app.Application;

/**
 * Created by hcw  on 2020/5/30
 * 类描述：
 * all rights reserved
 */
public interface INetworkRequiredInfo {
    String getAppVersionName();
    String getAppVersionCode();
    boolean isDebug();
    Application getApplicationContext();
}

