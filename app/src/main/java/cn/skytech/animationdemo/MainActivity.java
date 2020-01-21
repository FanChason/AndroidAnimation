package cn.skytech.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /** xml动画 */
    public void xmlAnimate(View view) {
        startActivity(new Intent(MainActivity.this, XMLActivity.class));
    }

    /** Java代码动画 */
    public void javaCodeAnimate(View view) {
        startActivity(new Intent(MainActivity.this, JavaCodeActivity.class));
    }

    /** Java代码动画 */
    public void objectAnimator(View view) {
        startActivity(new Intent(MainActivity.this, ObjectAnimatorActivity.class));
    }


}
