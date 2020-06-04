package com.example.asma3masiqa.SongManipulation;

import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;


public class PlayListner extends OnClickListner {

    public PlayListner(MyMediaPlayerSong myMediaPlayerSong, ButtonsStrategy buttonsStrategy) {
        super(myMediaPlayerSong,buttonsStrategy);
    }



    @Override
    public View.OnClickListener onClickListeners() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        getMyMediaPlayerSong().getMySongsPlayLists().resumeSong();
                        getButtonsStrategy().doOperation();
                    }
                };
            }


}
