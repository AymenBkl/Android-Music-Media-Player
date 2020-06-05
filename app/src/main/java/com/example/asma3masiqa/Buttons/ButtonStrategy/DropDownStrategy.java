package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.SongInteractions.SongInterecationHolder;

public class DropDownStrategy extends ButtonsStrategy {

    private  static SongInterecationHolder songInterecationHolder;

    public DropDownStrategy(View view){
        songInterecationHolder = new SongInterecationHolder(view);

    }


    @Override
    public void doOperation() {
        songInterecationHolder.fromSongPlayerToSongList();

    }

    public static void destroy(){
        songInterecationHolder = null;
    }

    public static void fromSongListToSongPlayer(){
        songInterecationHolder.fromSongListToSongPlayer();
    }
}
