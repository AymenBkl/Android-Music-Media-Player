package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;

public abstract class ButtonsStrategy {

    private Button play;
    private Button pause;
    private Button resume;
    public abstract void doOperation();

    public ButtonsStrategy(Button play, Button pause, Button resume) {
        this.play = play;
        this.pause = pause;
        this.resume = resume;
    }

    public Button getPlay() {
        return play;
    }

    public void setPlay(Button play) {
        this.play = play;
    }

    public Button getPause() {
        return pause;
    }

    public void setPause(Button pause) {
        this.pause = pause;
    }

    public Button getResume() {
        return resume;
    }

    public void setResume(Button resume) {
        this.resume = resume;
    }
}
