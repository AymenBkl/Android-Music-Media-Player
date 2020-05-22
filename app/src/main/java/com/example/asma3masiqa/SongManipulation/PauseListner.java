package com.example.asma3masiqa.SongManipulation;

import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;

public class PauseListner  extends  OnClickListner{


    public PauseListner(MyMediaPlayerSong myMediaPlayerSong, ButtonsStrategy buttonsStrategy) {
        super(myMediaPlayerSong,buttonsStrategy);
    }



    @Override
    public View.OnClickListener onClickListeners() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        getMyMediaPlayerSong().getMySongsPlayLists().pauseSong();
                        getButtonsStrategy().doOperation();
                    }
                };
            }

}


