package com.example.asma3masiqa.SongManipulation;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;
import com.example.asma3masiqa.SongInteractions.SongShuffled;

public class ShuffleListner extends OnClickListner{

    public ShuffleListner(MyMediaPlayerSong myMediaPlayerSong, ButtonsStrategy buttonsStrategy) {
        super(myMediaPlayerSong, buttonsStrategy);
    }

    @Override
    public View.OnClickListener onClickListeners() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SongShuffled.getSongShuffled().getShuffled()){
                    SongShuffled.getSongShuffled().setShuffled(false);
                }
                else {
                    SongShuffled.getSongShuffled().setShuffled(true);

                }
            }
        };
    }
}
