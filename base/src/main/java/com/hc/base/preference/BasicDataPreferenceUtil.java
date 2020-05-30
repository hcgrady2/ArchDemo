package com.hc.base.preference;

/**
 * Created by hcw  on 2020/5/30
 * 类描述：
 * all rights reserved
 */
public class BasicDataPreferenceUtil extends BasePreferences {
    private static final String BASIC_DATA_PREFERENCE_FILE_NAME = "network_api_module_basic_data_preference";
    private static BasicDataPreferenceUtil sInstance;

    public static BasicDataPreferenceUtil getInstance() {
        if (sInstance == null) {
            synchronized (BasicDataPreferenceUtil.class) {
                if (sInstance == null) {
                    sInstance = new BasicDataPreferenceUtil();
                }
            }
        }
        return sInstance;
    }

    @Override
    protected String getSPFileName() {
        return BASIC_DATA_PREFERENCE_FILE_NAME;
    }
}
