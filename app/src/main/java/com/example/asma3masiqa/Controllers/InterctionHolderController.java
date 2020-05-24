package com.example.asma3masiqa.Controllers;

import android.widget.LinearLayout;

public class InterctionHolderController  extends MainActivityViewControler{

    public InterctionHolderController(LinearLayout linearLayout){
        setHolderFragment(linearLayout);
    }

    @Override
    public void changeWeight() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getHolderFragment().getLayoutParams();
        layoutParams.weight = 9;
    }

    @Override
    public void changeWeightOriginal() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getHolderFragment().getLayoutParams();
        layoutParams.weight = 3;
    }
}
