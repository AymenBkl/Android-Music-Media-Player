package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;

import com.example.asma3masiqa.Controllers.VisibilityController;

public class ResumeOperation extends ButtonsStrategy {
    private Button play;
    private Button pause;
    private Button resume;
    public ResumeOperation(Button play, Button pause, Button resume) {
        this.play = play;
        this.pause = pause;
        this.resume = resume;
    }
    @Override
    public void doOperation() {
        VisibilityController.visibilityToGone(this.resume);
        VisibilityController.visibilityToGone(this.play);
        VisibilityController.visibilityToVisible(this.pause);

    }
}
