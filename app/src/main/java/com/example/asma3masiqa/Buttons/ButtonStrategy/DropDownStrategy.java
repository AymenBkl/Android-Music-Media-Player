package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.SongInteractions.SongInterecationHolder;

public class DropDownStrategy extends ButtonsStrategy {

    private static SongInterecationHolder songInterecationHolder;

    public DropDownStrategy(View view){
        this.songInterecationHolder = new SongInterecationHolder(view);

    }


    @Override
    public void doOperation() {
        this.songInterecationHolder.fromSongPlayerToSongList();

    }

    public static void fromSongListToSongPlayer(){
        songInterecationHolder.fromSongListToSongPlayer();
    }
}
