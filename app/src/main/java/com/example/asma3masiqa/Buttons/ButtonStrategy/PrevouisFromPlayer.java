package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;

public class PrevouisFromPlayer extends ButtonsStrategy{

    public PrevouisFromPlayer(Button play, Button pause, Button resume) {
        super(play, pause, resume);
    }

    @Override
    public void doOperation() {

    }

    public boolean checks(int position){
        if (position >= 0 ){
            return true;
        }
        else {
            return false;
        }
    }

}
