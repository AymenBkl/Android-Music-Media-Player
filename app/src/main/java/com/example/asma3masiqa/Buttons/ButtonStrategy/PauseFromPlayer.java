package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;

import com.example.asma3masiqa.Buttons.VisibilityController;

public class PauseFromPlayer extends ButtonsStrategy {

    public PauseFromPlayer(Button play, Button pause, Button resume) {
        super(play, pause, resume);
    }

    @Override
    public void doOperation() {

        VisibilityController.visibilityToVisible(getPlay());
        VisibilityController.visibilityToGone(getPause());

    }

}
