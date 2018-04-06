package com.bingyan.tools.SmartShow.snackbar;

import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;

/**
 * Created by cyc20 on 2018/4/6.
 */

public interface SnackbarSetting {
    SnackbarSetting backgroundColor(@ColorInt int color);

    SnackbarSetting backgroundColorRes(@ColorRes int colorRes);

    SnackbarSetting msgTextColor(@ColorInt int color);

    SnackbarSetting msgTextColorRes(@ColorRes int colorRes);

    SnackbarSetting msgTextSizeSp(int textSizeSp);

    SnackbarSetting actionColor(@ColorInt int color);

    SnackbarSetting actionColorRes(@ColorRes int colorRes);

    SnackbarSetting actionSizeSp(int textSizeSp);

    SnackbarSetting processView(ProcessViewCallback callback);
}
