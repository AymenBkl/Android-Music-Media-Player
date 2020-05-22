package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;
import android.widget.Toast;

import com.example.asma3masiqa.Controllers.VisibilityController;

public class NextFromPlayer extends ButtonsStrategy{
    private int size;
    private Button play;
    private Button pause;
    public NextFromPlayer(Button play, Button pause,int size) {
        this.play = play;
        this.pause = pause;
        this.size = size;
    }

    @Override
    public void doOperation() {
        VisibilityController.visibilityToInvisible(this.play);
        VisibilityController.visibilityToIVisible(this.pause);

    }

    public boolean checks(int position){
        if (position < size ){
            return true;
        }
        else {
            return false;
        }
    }
}
