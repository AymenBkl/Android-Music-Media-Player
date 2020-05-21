package com.example.asma3masiqa.Buttons;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Controllers.ButtonCommunicationsController;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;


public class PauseButton extends MyButtons {


    public PauseButton(int id,MySongsPlayLists mySongsPlayLists, ButtonsStrategy buttonsStrategy) {
        super(mySongsPlayLists, buttonsStrategy);
        setId(id);
    }


    public View.OnClickListener buttonFunction(ButtonCommunicationsController buttonCommunicationsController){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMySongsPlayLists().pauseSong();
                getButtonsStrategy().doOperation();
                Log.i("lol","xdplaying from"+getId());
            }
        };
    }
}
