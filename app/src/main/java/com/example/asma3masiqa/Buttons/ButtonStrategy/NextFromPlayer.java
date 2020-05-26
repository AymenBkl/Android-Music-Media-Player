package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.asma3masiqa.Controllers.VisibilityController;
import com.example.asma3masiqa.SongInteractions.SongInterecationHolder;

public class NextFromPlayer extends ButtonsStrategy{
    private int size;
    private Button play;
    private Button pause;
    private SongInterecationHolder songInterecationHolder;
    public NextFromPlayer(Button play, Button pause,View view ,int size) {
        this.play = play;
        this.pause = pause;
        this.songInterecationHolder = new SongInterecationHolder(view);
        this.size = size;
    }

    @Override
    public void doOperation() {
        VisibilityController.visibilityToInvisible(this.play);
        VisibilityController.visibilityToIVisible(this.pause);
        this.songInterecationHolder.fromSongListToSongPlayer();
    }

    public boolean checks(int position){
        if (position < size - 1 ){
            return true;
        }
        else {
            return false;
        }
    }
}
