package com.example.asma3masiqa.SongManipulation;

import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Buttons.ButtonStrategy.PrevouisFromPlayer;
import com.example.asma3masiqa.Fragments.FragmentCommunication;
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
                        setCurrentSong(FragmentCommunication.getFragmentCommunication().getCurrentSong());
                        if (((PrevouisFromPlayer) getButtonsStrategy()).checks(getCurrentSong())) {
                            getMyMediaPlayerSong().playMySong(getCurrentSong()-1);
                            setCurrentSong(getCurrentSong()-1);
                            getButtonsStrategy().doOperation();
                        }

                    }
                };

            }

}
