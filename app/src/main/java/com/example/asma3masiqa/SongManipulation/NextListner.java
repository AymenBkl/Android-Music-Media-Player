package com.example.asma3masiqa.SongManipulation;

import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Buttons.ButtonStrategy.NextFromPlayer;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;

public class NextListner extends OnClickListner {
    private int size;

    public NextListner(MyMediaPlayerSong myMediaPlayerSong, ButtonsStrategy buttonsStrategy) {
        super(myMediaPlayerSong, buttonsStrategy);
        this.size = myMediaPlayerSong.getMySongsPlayLists().sizeFile();
    }

    @Override
    public View.OnClickListener onClickListeners() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((NextFromPlayer) getButtonsStrategy()).checks(getCurrentSong())){
                    getMyMediaPlayerSong().playMySong(getCurrentSong() + 1);
                    setCurrentSong(getCurrentSong() + 1);
                    getButtonsStrategy().doOperation();
                }

            }

        };
    }
}





