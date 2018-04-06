package com.bingyan.tools.SmartShow.toast;

import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;

/**
 * Created by cyc20 on 2018/4/6.
 */

public interface PlainToastSetting {
    PlainToastSetting backgroundColor(@ColorInt int color);
    PlainToastSetting backgroundColorRes(@ColorRes int colorRes);
    PlainToastSetting textColor(@ColorInt int color);
    PlainToastSetting textColorRes(@ColorRes int color);
    PlainToastSetting textSizeSp(int sp);
    PlainToastSetting textBold(boolean bold);
    PlainToastSetting processPlainView(ProcessViewCallback callback);
}
