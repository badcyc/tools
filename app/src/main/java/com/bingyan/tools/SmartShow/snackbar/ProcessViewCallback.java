package com.bingyan.tools.SmartShow.snackbar;

import android.support.design.widget.Snackbar;
import android.widget.TextView;

/**
 * Created by cyc20 on 2018/4/6.
 */

public interface ProcessViewCallback {
    void processSnackbarView(Snackbar.SnackbarLayout layout, TextView msgView, TextView actionView);
}
