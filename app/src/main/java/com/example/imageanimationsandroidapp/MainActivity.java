package com.example.imageanimationsandroidapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity implements ExampleBottomSheetDialog.BottomSheetListener {

    private TextView mTextView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOpenBottomSheet = findViewById(R.id.id_button_open_bottom_sheet);
        mTextView = findViewById(R.id.id_text_view_button_clicked);
        buttonOpenBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ExampleBottomSheetDialog bottomSheet = new ExampleBottomSheetDialog();
                bottomSheet.show(getSupportFragmentManager(),"example_bottom_sheet");

            }
        });



    }

    @Override
    public void onButtonClicked(String text) {

        mTextView.setText(text);



    }
}
