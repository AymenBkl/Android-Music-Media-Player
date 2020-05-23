package com.example.asma3masiqa.Controllers;

import android.widget.LinearLayout;

public class BasicHolderControler extends MainActivityViewControler {

    public BasicHolderControler(LinearLayout linearLayout){
        setHolderFragment(linearLayout);
    }
    @Override
    public void changeWeight() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getHolderFragment().getLayoutParams();
        layoutParams.weight = 0;
    }
}
