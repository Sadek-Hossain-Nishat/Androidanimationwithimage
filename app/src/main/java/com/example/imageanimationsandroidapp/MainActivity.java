package com.example.imageanimationsandroidapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;


public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    private ConstraintSet constraintSetOld = new ConstraintSet();
    private ConstraintSet constraintSetNew = new ConstraintSet();
    private boolean altLayout;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);

        constraintSetOld.clone(layout);

        constraintSetNew.clone(this,R.layout.activity_main_alt);










    }


    public void swapView(View view) {

        TransitionManager.beginDelayedTransition(layout);
        if (!altLayout) {

            constraintSetNew.applyTo(layout);
            altLayout = true;
        } else {
            
        }


    }


}
