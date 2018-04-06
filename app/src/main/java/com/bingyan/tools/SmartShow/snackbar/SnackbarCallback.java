package com.bingyan.tools.SmartShow.snackbar;

import android.support.design.widget.Snackbar;

/**
 * Created by cyc20 on 2018/4/6.
 */

public interface SnackbarCallback {
    void onSnackbarShown(Snackbar sb);

    void onSnackbarDismissed(Snackbar sb, int event);
}
