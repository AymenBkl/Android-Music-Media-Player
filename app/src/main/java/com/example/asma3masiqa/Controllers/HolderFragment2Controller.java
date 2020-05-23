package com.example.asma3masiqa.Controllers;

import android.widget.LinearLayout;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;

public class HolderFragment2Controller extends MainActivityViewControler {

    public HolderFragment2Controller(MainActivity mainActivity){
        setHolderFragment((LinearLayout) mainActivity.findViewById(R.id.holderForfragment2));
    }

    @Override
    public void changeWeight() {
       LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getHolderFragment().getLayoutParams();
       layoutParams.weight = 1;
    }
}
