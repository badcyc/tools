package com.bingyan.tools.SmartShow.toast;

import android.support.annotation.LayoutRes;
import android.view.View;

/**
 * Created by cyc20 on 2018/4/6.
 */

public interface CustomToastSetting {
    CustomToastSetting view(View view);
    CustomToastSetting view(@LayoutRes int layout);
    CustomToastSetting processCustomView(ProcessViewCallback processViewCallback);
}
