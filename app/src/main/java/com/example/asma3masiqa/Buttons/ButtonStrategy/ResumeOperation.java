package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;

import com.example.asma3masiqa.Controllers.VisibilityController;

public class ResumeOperation extends ButtonsStrategy {
    public ResumeOperation(Button play, Button pause, Button resume) {
        super(play, pause, resume);
    }

    @Override
    public void doOperation() {
        VisibilityController.visibilityToGone(getResume());
        VisibilityController.visibilityToVisible(getPause());

    }
}
