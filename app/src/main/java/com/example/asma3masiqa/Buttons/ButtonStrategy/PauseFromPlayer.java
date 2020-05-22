package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.opengl.Visibility;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Controllers.VisibilityController;

public class PauseFromPlayer extends ButtonsStrategy {

    private Button play;
    private Button pause;
    public PauseFromPlayer(Button play, Button pause) {
        this.play = play;
        this.pause = pause;
    }
    @Override
    public void doOperation() {
        VisibilityController.visibilityToInvisible(this.pause);
        VisibilityController.visibilityToIVisible(this.play);


    }

}
