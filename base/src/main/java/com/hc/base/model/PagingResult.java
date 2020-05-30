package com.hc.base.model;

/**
 * Created by hcw  on 2020/5/30
 * 类描述：
 * all rights reserved
 */
public class PagingResult {
    public PagingResult(boolean isEmpty, boolean isFirstPage, boolean hasNextPage) {
        this.isEmpty = isEmpty;
        this.isFirstPage = isFirstPage;
        this.hasNextPage = hasNextPage;
    }

    public boolean isFirstPage;
    public boolean isEmpty;
    public boolean hasNextPage;
}
