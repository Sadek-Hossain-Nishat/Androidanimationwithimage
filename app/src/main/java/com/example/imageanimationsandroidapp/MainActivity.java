package com.example.imageanimationsandroidapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionValues;
import android.view.View;
import android.view.animation.OvershootInterpolator;

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

        // these two lines are optional ,
        // these are used to show bounds transition effect

        Transition changeBoundes = new ChangeBounds();
        changeBoundes.setInterpolator(new OvershootInterpolator());
 // for normal showing
        //TransitionManager.beginDelayedTransition(layout);
        // for bounds transition effect
        // we can use
        TransitionManager.beginDelayedTransition(layout,changeBoundes);
        if (!altLayout) {

            constraintSetNew.applyTo(layout);
            altLayout = true;
        } else {


            constraintSetOld.applyTo(layout);
            altLayout = false;

        }


    }


}
