package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;

import com.example.asma3masiqa.Controllers.VisibilityController;

public class PlayFromPlayer extends ButtonsStrategy {
    public PlayFromPlayer(Button play, Button pause, Button resume) {
        super(play, pause, resume);
    }

    @Override
    public void doOperation() {
        VisibilityController.visibilityToInvisible(getPlay());
        VisibilityController.visibilityToIVisible(getPause());
    }
}