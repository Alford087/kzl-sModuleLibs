package com.kzl.lib.utils.base;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created with IntelliJ IDEA.<br/>
 * User: kezhenlu@qq.com<br/>
 * Date: 13-10-9<br/>
 * Time: 下午3:32<br/>
 * To change this template use File | Settings | File Templates.
 */
public class BasePreferencesUtil {
    private static final String BASE_PREFERENCES_NAME = "preferences";
    public SharedPreferences preference;
    public SharedPreferences.Editor editor;

    public BasePreferencesUtil(Context context) {
        preference = context.getSharedPreferences(BASE_PREFERENCES_NAME,
                Context.MODE_PRIVATE);
        editor = preference.edit();
    }

    public BasePreferencesUtil(Context context, String preferencesName) {
        preference = context.getSharedPreferences(preferencesName,
                Context.MODE_PRIVATE);
        editor = preference.edit();
    }

    public void commit() {
        editor.commit();
    }

}
