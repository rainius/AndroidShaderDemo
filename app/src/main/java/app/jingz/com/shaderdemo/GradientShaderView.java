package app.jingz.com.shaderdemo;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2014/11/18.
 */
public class GradientShaderView extends View {
    private PointF beginPoint;
    private PointF endPoint;

    public GradientShaderView(Context context) {
        super(context);
    }

    public GradientShaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GradientShaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public GradientShaderView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

                break;
        }

        return super.onTouchEvent(event);
    }
}
