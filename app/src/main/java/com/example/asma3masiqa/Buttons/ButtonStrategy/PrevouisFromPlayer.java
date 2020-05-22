package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;

import com.example.asma3masiqa.Controllers.VisibilityController;

public class PrevouisFromPlayer extends ButtonsStrategy{

    private Button play;
    private Button pause;
    public PrevouisFromPlayer(Button play, Button pause) {
        this.play = play;
        this.pause = pause;
    }

    @Override
    public void doOperation() {
        VisibilityController.visibilityToInvisible(this.play);
        VisibilityController.visibilityToIVisible(this.pause);
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
