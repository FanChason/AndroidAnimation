package cn.skytech.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class XMLActivity extends AppCompatActivity {

    View mTargetView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml);

        mTargetView = findViewById(R.id.view);

    }

    public void clickToAlpha(View view) {
        Animation alphaAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.view_anim_alpha);
        mTargetView.startAnimation(alphaAnim);

        alphaAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(XMLActivity.this, "动画开始", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(XMLActivity.this, "动画结束", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                Toast.makeText(XMLActivity.this, "动画重复", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void clickToRotate(View view) {
        Animation rotateAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.view_anim_rotate);
        mTargetView.startAnimation(rotateAnim);
    }

    public void clickToScale(View view) {
        Animation scaleAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.view_anim_scale);
        mTargetView.startAnimation(scaleAnim);
    }

    public void clickToTranslate(View view) {
        Animation translateAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.view_anim_translate);
        mTargetView.startAnimation(translateAnim);
    }

    public void clickToSet(View view) {
        Animation setAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.view_anim_set);
        mTargetView.startAnimation(setAnim);
    }
}
