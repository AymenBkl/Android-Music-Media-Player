package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;

import com.example.asma3masiqa.Buttons.VisibilityController;

public class PauseOperation extends ButtonsStrategy{


    public PauseOperation(Button play, Button pause, Button resume) {
        super(play, pause, resume);
    }

    @Override
    public void doOperation() {
        VisibilityController.visibilityToGone(getPause());
        VisibilityController.visibilityToVisible(getResume());
        VisibilityController.visibilityToGone(getPlay());
    }
}
