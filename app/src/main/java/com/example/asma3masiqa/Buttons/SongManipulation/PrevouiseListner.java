package com.example.asma3masiqa.Buttons.SongManipulation;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Buttons.ButtonStrategy.PrevouisFromPlayer;
import com.example.asma3masiqa.Controllers.VisibilityController;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;

public class PrevouiseListner extends OnClickListner {
    public PrevouiseListner(MyMediaPlayerSong myMediaPlayerSong, ButtonsStrategy buttonsStrategy) {
        super(myMediaPlayerSong,buttonsStrategy);
    }

    @Override
    public View.OnClickListener onClickListeners() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        if (((PrevouisFromPlayer) getButtonsStrategy()).checks(getCurrentSong())) {
                            getMyMediaPlayerSong().playMySong(getCurrentSong()-1);
                            setCurrentSong(getCurrentSong()-1);
                            getButtonsStrategy().doOperation();
                        }

                    }
                };

            }

}
