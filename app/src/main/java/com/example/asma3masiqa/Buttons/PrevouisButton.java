package com.example.asma3masiqa.Buttons;

import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Buttons.ButtonStrategy.PrevouisFromPlayer;
import com.example.asma3masiqa.Controllers.ButtonCommunicationsController;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public class PrevouisButton extends MyButtons {
    public PrevouisButton(MySongsPlayLists mySongsPlayLists, ButtonsStrategy buttonsStrategy) {
        super(mySongsPlayLists, buttonsStrategy);
        setId(16);
    }

    public View.OnClickListener buttonFunction() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    setId(getId()-1);
                    getMySongsPlayLists().playSong(getId());

            }
        };
    }
}
