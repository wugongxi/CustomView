package com.wgx.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wu on 2018/3/23 0023.
 */

public class ScanView extends View{

    public ScanView(Context context) {
        super(context);
    }

    public ScanView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ScanView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.BLUE);           // 画一个蓝色的背景色
        // 先画一次原文字
//        canvas.drawBitmap(mT    extBitmap, 0, 0, mPaint);
//         保存画布
//        int sc = canvas.saveLayer(0, 0, getWidth(), getHeight(), null,
//                Canvas.MATRIX_SAVE_FLAG |
//                        Canvas.CLIP_SAVE_FLAG |
//                        Canvas.HAS_ALPHA_LAYER_SAVE_FLAG |
//                        Canvas.FULL_COLOR_LAYER_SAVE_FLAG |
//                        Canvas.CLIP_TO_LAYER_SAVE_FLAG);
//
//         画光效的文字
//        canvas.drawBitmap(mTextBitmap, 0, 0, mPaint);
//        mPaint.setXfermode(mXfermode);
//        canvas.drawBitmap(mLightBitmap, 0, 0, mPaint);
//        mPaint.setXfermode(null);
//
//        canvas.restoreToCount(sc);
    }
}
