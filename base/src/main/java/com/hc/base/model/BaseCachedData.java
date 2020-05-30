package com.hc.base.model;

import java.io.Serializable;

/**
 * Created by hcw  on 2020/5/30
 * 类描述：
 * all rights reserved
 */
public class BaseCachedData<T> implements Serializable {
    public long updateTimeInMills;
    public T data;
}
