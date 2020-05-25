package com.example.asma3masiqa.Controllers;

import android.widget.LinearLayout;

import com.example.asma3masiqa.Fragments.MyFragmentManager;

public class BasicHolderControler extends MainActivityViewControler {
    public BasicHolderControler(LinearLayout linearLayout){
        setHolderFragment(linearLayout);
    }
    @Override
    public void changeWeight() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getHolderFragment().getLayoutParams();
        layoutParams.weight = 0;
    }

    @Override
    public void changeWeightOriginal() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getHolderFragment().getLayoutParams();
        layoutParams.weight = 6;
    }
}
