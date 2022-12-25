package com.example.imageanimationsandroidapp;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class ExampleBottomSheetDialog extends BottomSheetDialogFragment {

    private BottomSheetListener mListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_layout,container,false);

        Button button1 = view.findViewById(R.id.id_button1);
        Button button2 = view.findViewById(R.id.id_button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mListener.onButtonClicked("Button 1 clicked");
                dismiss();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mListener.onButtonClicked("Button 2 clicked");
                dismiss();

            }
        });


        return view;
    }





    public interface BottomSheetListener{
        void onButtonClicked(String text);

    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);


        try {
            mListener = (BottomSheetListener) context;

        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
            +" must implement BottomSheetListener");
        }
    }
}