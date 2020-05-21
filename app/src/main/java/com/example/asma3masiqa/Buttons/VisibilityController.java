package com.example.asma3masiqa.Buttons;

import android.view.View;

public class VisibilityController {

    public static void visibilityToGone(View view){
        if (view.getVisibility() == View.VISIBLE){
            view.setVisibility(View.GONE);
        }
    }

    public static void visibilityToVisible(View view){
        if (view.getVisibility() == View.GONE){
            view.setVisibility(View.VISIBLE);
        }
    }
}
