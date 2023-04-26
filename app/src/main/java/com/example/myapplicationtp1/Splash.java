package com.example.myapplicationtp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 10000;

    Animation topAnim;

    TextView welcometxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Splash.this, MainActivity.class);
            startActivity(intent);

            finish();
        }, SPLASH_TIME_OUT);

        welcometxt=findViewById(R.id.textView);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        welcometxt.setAnimation(topAnim);
    }
}