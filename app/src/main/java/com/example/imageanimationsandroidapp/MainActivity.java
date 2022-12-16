package com.example.imageanimationsandroidapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    private BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View  bottomSheet = findViewById(R.id.id_bottom_sheet);
        bottomSheetBehavior  = BottomSheetBehavior.from(bottomSheet);

        FloatingActionButton fab = findViewById(R.id.id_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Snackbar.make(view,"This is a Snackbar",Snackbar.LENGTH_LONG).show();

            }
        });

        Button button = findViewById(R.id.id_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });





    }
}
