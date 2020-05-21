package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;

import com.example.asma3masiqa.Buttons.VisibilityController;

public class PlayOperation extends ButtonsStrategy {

    public PlayOperation(Button play, Button pause, Button resume) {
        super(play, pause, resume);
    }

    @Override
    public void doOperation() {
        VisibilityController.visibilityToVisible(getPause());
        VisibilityController.visibilityToGone(getResume());
        VisibilityController.visibilityToGone(getPlay());
    }
}
