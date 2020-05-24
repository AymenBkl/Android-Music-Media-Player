package com.example.asma3masiqa.SongInteractions.SongInteracetionFactory;

import android.view.View;
import android.widget.LinearLayout;

import com.example.asma3masiqa.R;

public class SongInteractionHolderFactory extends SongInteractionFactory{

    public static LinearLayout getLinearLayout(View view){
        return (LinearLayout) view.findViewById(R.id.interecationHolder);
    }
}
