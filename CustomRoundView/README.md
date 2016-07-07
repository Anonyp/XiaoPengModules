### Android自定义view实现可配置圆环

* CustomRoundView自定义View

* 动画实现

```java
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

```
