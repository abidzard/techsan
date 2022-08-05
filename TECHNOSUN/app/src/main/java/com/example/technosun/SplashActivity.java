package com.example.technosun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class SplashActivity extends AppCompatActivity {

    ImageView Alogo;
    private int waktu_loading=2300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);
        Alogo = (ImageView)findViewById(R.id.Alogo);

        Glide.with(SplashActivity.this)
                .load(R.drawable.logo_animasi)
                .asGif()
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(Alogo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent it=new Intent(SplashActivity.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        },waktu_loading);
    }
}