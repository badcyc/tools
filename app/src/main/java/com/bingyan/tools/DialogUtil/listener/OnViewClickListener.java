package com.bingyan.tools.DialogUtil.listener;

import android.view.View;

import com.bingyan.tools.DialogUtil.DialogUtil;
import com.bingyan.tools.DialogUtil.base.BindViewHolder;

/**
 * Created by cyc20 on 2018/4/18.
 */

public interface OnViewClickListener {
    void onViewClick(BindViewHolder viewHolder, View view, DialogUtil tDialog);
}
