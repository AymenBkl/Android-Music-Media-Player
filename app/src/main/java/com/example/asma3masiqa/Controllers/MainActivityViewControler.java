package com.example.asma3masiqa.Controllers;


import android.widget.LinearLayout;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;

public abstract class MainActivityViewControler {

    private LinearLayout holderFragment;
    public abstract void changeWeight();
    public abstract void changeWeightOriginal();

    public void toGone(){
        VisibilityController.visibilityToGone(this.holderFragment);
    }

    public void toVisible(){
        VisibilityController.visibilityToVisible(this.holderFragment);
    }

    public LinearLayout getHolderFragment() {
        return holderFragment;
    }

    public void setHolderFragment(LinearLayout holderFragment) {
        this.holderFragment = holderFragment;
    }
}
