package com.hc.network.environment;

/**
 * Created by hcw  on 2020/5/30
 * 类描述：
 * all rights reserved
 */

public interface IEnvironment {

    //区分正式环境和测试环境

    String getFormal();

    String getTest();
}
