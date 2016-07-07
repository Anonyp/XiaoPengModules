package com.xiaopeng.customround;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CustomRoundView ringView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ringView= (CustomRoundView) findViewById(R.id.RingView);
        textView= (TextView) findViewById(R.id.tv);

        //设置是否显示段条
        ringView.setShowSelect(false);
//      ringView.setSelectCount(10);

        //动画显示
        ValueAnimator valueAnimator = ValueAnimator.ofInt(0, 100);
        valueAnimator.setTarget(textView);
        valueAnimator.setDuration(2000);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int i = Integer.valueOf(String.valueOf(animation.getAnimatedValue()));
                textView.setText(i + "");
                ringView.setSelect((int) (360 * (i / 100f)));
            }
        });
        valueAnimator.start();

    }
}
