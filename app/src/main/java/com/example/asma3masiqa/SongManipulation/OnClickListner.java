package com.example.asma3masiqa.SongManipulation;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;

public abstract class OnClickListner  {
    private MyMediaPlayerSong myMediaPlayerSong;
    private int currentSong;
    private ButtonsStrategy buttonsStrategy;

    public OnClickListner(MyMediaPlayerSong myMediaPlayerSong,ButtonsStrategy buttonsStrategy){
        this.myMediaPlayerSong = myMediaPlayerSong;
        this.currentSong = FragmentCommunication.getFragmentCommunication().getCurrentSong();
        this.buttonsStrategy = buttonsStrategy;
    }
    public abstract View.OnClickListener onClickListeners();

    public MyMediaPlayerSong getMyMediaPlayerSong() {
        return myMediaPlayerSong;
    }

    public void setMyMediaPlayerSong(MyMediaPlayerSong myMediaPlayerSong) {
        this.myMediaPlayerSong = myMediaPlayerSong;
    }

    public int getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(int currentSong) {

        this.currentSong = currentSong;
    }

    public ButtonsStrategy getButtonsStrategy() {
        return buttonsStrategy;
    }

    public void setButtonsStrategy(ButtonsStrategy buttonsStrategy) {
        this.buttonsStrategy = buttonsStrategy;
    }
}
