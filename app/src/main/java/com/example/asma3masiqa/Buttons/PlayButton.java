package com.example.asma3masiqa.Buttons;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Controllers.ButtonCommunicationsController;
import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public class PlayButton extends MyButtons {



    public PlayButton(int id,MySongsPlayLists mySongsPlayLists, ButtonsStrategy buttonsStrategy) {
        super(mySongsPlayLists, buttonsStrategy);
        setId(id);
    }


    public View.OnClickListener buttonFunction(final ButtonCommunicationsController buttonCommunicationsController){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMySongsPlayLists().playSong(getId());
                getButtonsStrategy().doOperation();
                buttonCommunicationsController.checks(getId());
                FragmentCommunication.getFragmentCommunication().setCurrentSong(getId());
                MyFragmentManager.getMyFragmentManager().fromSongListToSongPlayer();
            }
        };
    }
}
