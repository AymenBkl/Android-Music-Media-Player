package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;
import android.widget.Toast;

public class NextFromPlayer extends ButtonsStrategy{
    private int size;
    public NextFromPlayer(Button play, Button pause, Button resume,int size) {
        super(play, pause, resume);
        this.size = size;
    }

    @Override
    public void doOperation() {

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
