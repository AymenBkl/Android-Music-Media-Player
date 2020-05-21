package com.example.asma3masiqa.Buttons;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Buttons.ButtonStrategy.NextFromPlayer;
import com.example.asma3masiqa.Buttons.FactoryButton.NextFromPlayerButton;
import com.example.asma3masiqa.Controllers.ButtonCommunicationsController;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public class NextButton extends MyButtons {

    public NextButton(MySongsPlayLists mySongsPlayLists, ButtonsStrategy buttonsStrategy) {
        super(mySongsPlayLists,buttonsStrategy);
        setId(16);
    }

    public View.OnClickListener buttonFunction() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    setId(getId()+1);
                    getMySongsPlayLists().playSong(getId());

            }
        };
    }
}
