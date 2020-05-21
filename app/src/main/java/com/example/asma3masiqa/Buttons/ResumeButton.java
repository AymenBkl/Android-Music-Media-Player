package com.example.asma3masiqa.Buttons;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Controllers.ButtonCommunicationsController;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public class ResumeButton extends MyButtons {


    public ResumeButton(int id,MySongsPlayLists mySongsPlayLists, ButtonsStrategy buttonsStrategy) {
        super(mySongsPlayLists, buttonsStrategy);
        setId(id);
    }


    public View.OnClickListener buttonFunction(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMySongsPlayLists().resumeSong();
                getButtonsStrategy().doOperation();
                Log.i("lol","xdplaying from"+getId());
            }
        };
    }
}
