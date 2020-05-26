package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Controllers.VisibilityController;
import com.example.asma3masiqa.SongInteractions.SongInterecationHolder;

public class PrevouisFromPlayer extends ButtonsStrategy{

    private Button play;
    private Button pause;
    private SongInterecationHolder songInterecationHolder;
    public PrevouisFromPlayer(Button play, Button pause, View view) {
        this.play = play;
        this.pause = pause;
        this.songInterecationHolder = new SongInterecationHolder(view);
    }

    @Override
    public void doOperation() {
        VisibilityController.visibilityToInvisible(this.play);
        VisibilityController.visibilityToIVisible(this.pause);
        this.songInterecationHolder.fromSongListToSongPlayer();
    }

    public boolean checks(int position){
        if (position >= 0 ){
            return true;
        }
        else {
            return false;
        }
    }

}
