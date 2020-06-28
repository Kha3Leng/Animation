package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean flag = true;

    public void transformer(View view){
        ImageView bart = (ImageView) findViewById(R.id.bartimageView);
        ImageView homer = (ImageView) findViewById(R.id.homerimageView);

        Log.i("Value", "You tappped");
//        bart.animate().translationX(-2000);
        bart.animate().translationX(2000).rotation(360).setDuration(2000);
        bart.animate().scaleX(1).scaleY(1).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart = (ImageView) findViewById(R.id.bartimageView);
        bart.setX(-2000);
        bart.setScaleY(0.5f);
        bart.setScaleX(0.5f);
        bart.animate().translationXBy(2000).rotation(360).setDuration(2000);
        bart.animate().scaleY(1f).scaleX(1f).setDuration(2000);
    }
}