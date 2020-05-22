package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;

import com.example.asma3masiqa.Controllers.VisibilityController;

public class PlayOperation extends ButtonsStrategy {

    private Button play;
    private Button pause;
    private Button resume;
    public PlayOperation(Button play, Button pause, Button resume) {
        this.play = play;
        this.pause = pause;
        this.resume = resume;
    }

    @Override
    public void doOperation() {
        VisibilityController.visibilityToVisible(this.pause);
        VisibilityController.visibilityToGone(this.resume);
        VisibilityController.visibilityToGone(this.play);
    }
}
