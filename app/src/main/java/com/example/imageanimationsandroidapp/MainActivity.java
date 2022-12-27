package com.example.imageanimationsandroidapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private ImageView bottle;
    private Random random = new Random();
    private int lastDir;
    private boolean spinning;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottle = findViewById(R.id.id_bottle);



    }


    public void spinBottle(View view) {

        int newDir = random.nextInt(1800);
        float pivotX = bottle.getWidth()/2;
        float pivotY = bottle.getHeight()/2;

        Animation rotate = new RotateAnimation(lastDir,newDir,pivotX,pivotY);
        rotate.setDuration(2500);
        rotate.setFillAfter(true);
        lastDir = newDir;
        bottle.startAnimation(rotate);




    }
}
