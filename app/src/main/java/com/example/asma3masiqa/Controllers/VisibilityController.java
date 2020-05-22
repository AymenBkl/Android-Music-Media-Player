package com.example.asma3masiqa.Controllers;

import android.util.Log;
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
    public static void visibilityToInvisible(View view){
        if (view.getVisibility() == View.VISIBLE){
            view.setVisibility(View.INVISIBLE);
        }
    }
    public static void visibilityToIVisible(View view){
        if (view.getVisibility() == View.INVISIBLE){
            view.setVisibility(View.VISIBLE);
        }
    }
}
