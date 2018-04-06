package com.bingyan.tools.SmartShow.snackbar;

import android.view.View;

/**
 * Created by cyc20 on 2018/4/6.
 */

public interface SnackbarShow {

    void show(CharSequence msg);

    void show(CharSequence msg, CharSequence actionText);

    void show(CharSequence msg, CharSequence actionText, View.OnClickListener onActionClickListener);


    void showLong(CharSequence msg);

    void showLong(CharSequence msg, CharSequence actionText);

    void showLong(CharSequence msg, CharSequence actionText, View.OnClickListener onActionClickListener);


    void showIndefinite(CharSequence msg);

    void showIndefinite(CharSequence msg, CharSequence actionText);

    void showIndefinite(CharSequence msg, CharSequence actionText, View.OnClickListener onActionClickListener);
}
