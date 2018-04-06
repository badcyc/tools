package com.bingyan.tools.SmartShow.toast;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by cyc20 on 2018/4/6.
 */

public abstract class ProcessViewCallback {
    public void processCustomView(View view) {
    }

    public void processPlainView(LinearLayout outParent, TextView msgView) {
    }
}
