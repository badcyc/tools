package com.bingyan.tools.NineGridImageView;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bingyan.tools.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes;

/**
 * Created by cyc20 on 2018/4/15.
 */

public class NineGridImageView<T> extends ViewGroup {

    private int mRowCount;//行数
    private int mColumnCount;//列数

    private int mMaxSize = 9;
    private int mGap;//宫格间距

    private int mWidth;//当前组件宽度
    private int mHeight;//当前组件高度

    private List<ImageView> mImageViewList = new ArrayList<>();
    private List<T> mImgDataList;

    public NineGridImageView(Context context) {
        super(context, null);
    }

    public NineGridImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);

    }

    public NineGridImageView(Context context, AttributeSet attributeSet, int defStyleAttr) {
        super(context, attributeSet, defStyleAttr);
        TypedArray array = context.obtainStyledAttributes(attributeSet, R.styleable.NineGridImageView);
        this.mGap = (int) array.getDimension(R.styleable.NineGridImageView_imgGap, 8);
        array.recycle();
    }

    /**
     * 设置空间的宽高
     *
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = measureWidth(widthMeasureSpec);
        mHeight = measureHeight(heightMeasureSpec);
        setMeasuredDimension(mWidth, mHeight);
    }

    private int measureWidth(int widthMeasureSpec) {
        int result = 0;
        int specMode = MeasureSpec.getMode(widthMeasureSpec);
        int specSize = MeasureSpec.getSize(widthMeasureSpec);

        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else {
            result = 200;
            if (specMode == MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize);
            }
        }
        return result;
    }

    private int measureHeight(int heightMeasureSpec) {
        int result = 0;
        int specMode = MeasureSpec.getMode(heightMeasureSpec);
        int specSize = MeasureSpec.getSize(heightMeasureSpec);
        if (specMode == MeasureSpec.EXACTLY) {
            result = specSize;
        } else {
            result = 200;
            if (specMode == MeasureSpec.AT_MOST) {
                result = Math.min(result, specSize);
            }
        }
        return result;
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }
}
