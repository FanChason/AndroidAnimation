package cn.skytech.animationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ObjectAnimatorActivity extends AppCompatActivity {

    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);

        mImageView = findViewById(R.id.imageview);

    }

    public void startJavaPropertyAnimator(View view) {
        ObjectAnimator
                .ofFloat(mImageView, "rotationY", 0f, 360f)
                .setDuration(2000)
                .start();
    }
}
