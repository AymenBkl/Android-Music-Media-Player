package com.example.asma3masiqa.Buttons;

import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Buttons.ButtonStrategy.PauseFromPlayer;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public class PauseButtomFromPlayer extends MyButtons {
    public PauseButtomFromPlayer(MySongsPlayLists mySongsPlayLists, ButtonsStrategy buttonsStrategy) {
        super(mySongsPlayLists, buttonsStrategy);
        setId(16);
    }
    public View.OnClickListener buttonFunction() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMySongsPlayLists().pauseSong();

            }
        };
    }
}
