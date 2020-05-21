package com.example.asma3masiqa.Buttons;

import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Controllers.ButtonCommunicationsController;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public abstract class MyButtons  {

    private MySongsPlayLists mySongsPlayLists;
    private int id;
    private ButtonsStrategy buttonsStrategy;
    public MyButtons(MySongsPlayLists mySongsPlayLists,ButtonsStrategy buttonsStrategy){
        this.mySongsPlayLists = mySongsPlayLists;
        this.buttonsStrategy = buttonsStrategy;
    }

    public MySongsPlayLists getMySongsPlayLists() {
        return mySongsPlayLists;
    }

    public void setMySongsPlayLists(MySongsPlayLists mySongsPlayLists) {
        this.mySongsPlayLists = mySongsPlayLists;
    }



    public ButtonsStrategy getButtonsStrategy() {
        return buttonsStrategy;
    }

    public void setButtonsStrategy(ButtonsStrategy buttonsStrategy) {
        this.buttonsStrategy = buttonsStrategy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
