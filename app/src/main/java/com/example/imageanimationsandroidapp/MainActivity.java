package com.example.imageanimationsandroidapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;


import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private Placeholder placeholder;
    private ConstraintLayout layout;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);

        placeholder = findViewById(R.id.placeholder);





    }


    public void swapView(View view) {

        TransitionManager.beginDelayedTransition(layout);
        placeholder.setContentId(view.getId());
    }
}
