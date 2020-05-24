package com.example.asma3masiqa.Controllers;

import android.util.Log;
import android.widget.LinearLayout;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;

public class HolderFragment1Controler extends MainActivityViewControler {

    public HolderFragment1Controler(MainActivity mainActivity){
        setHolderFragment((LinearLayout) mainActivity.findViewById(R.id.holderForfragment1));
    }

    @Override
    public void changeWeight() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getHolderFragment().getLayoutParams();
        layoutParams.weight = 5;
    }

    @Override
    public void changeWeightOriginal() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getHolderFragment().getLayoutParams();
        layoutParams.weight = 6;
    }
}
