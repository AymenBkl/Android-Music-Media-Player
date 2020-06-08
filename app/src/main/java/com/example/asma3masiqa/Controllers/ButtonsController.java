package com.example.asma3masiqa.Controllers;

import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Buttons.ButtonStrategy.PauseOperation;
import com.example.asma3masiqa.Buttons.ButtonStrategy.PlayOperation;
import com.example.asma3masiqa.Buttons.ButtonStrategy.ResumeOperation;
import com.example.asma3masiqa.Buttons.FactoryButton.FavoriteButtonFactory;
import com.example.asma3masiqa.Buttons.FactoryButton.PauseButtonFactory;
import com.example.asma3masiqa.Buttons.FactoryButton.PlayButtonFactory;
import com.example.asma3masiqa.Buttons.FactoryButton.ResumeButtonFactory;
import com.example.asma3masiqa.Buttons.FavoriteButton;
import com.example.asma3masiqa.Buttons.PauseButton;
import com.example.asma3masiqa.Buttons.PlayButton;
import com.example.asma3masiqa.Buttons.ResumeButton;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

import java.util.ArrayList;
import java.util.List;

public class ButtonsController {
    private List<List<Button>> buttons;


    public ButtonsController(){
        this.buttons = new ArrayList<List<Button>>();

    }
    public void addButton(int id,View view,MySongsPlayLists mySongsPlayLists,ButtonCommunicationsController buttonCommunicationsController){
        List<Button> newButtons = new ArrayList<Button>();
        newButtons.add(PlayButtonFactory.getButton(view));
        newButtons.add(ResumeButtonFactory.getButton(view));
        newButtons.add(PauseButtonFactory.getButton(view));
        newButtons.add(FavoriteButtonFactory.getButton(view));
        this.buttons.add(newButtons);
        affectListners(id,mySongsPlayLists,newButtons,buttonCommunicationsController);

    }
    private void affectListners(int id,MySongsPlayLists mySongsPlayLists,List<Button> newButtons,ButtonCommunicationsController buttonCommunicationsController){
        newButtons.get(0).setOnClickListener((new PlayButton(id,mySongsPlayLists,new PlayOperation(newButtons.get(0),newButtons.get(2),newButtons.get(1)))).buttonFunction(buttonCommunicationsController));
        newButtons.get(2).setOnClickListener(new PauseButton(id,mySongsPlayLists,new PauseOperation(newButtons.get(0),newButtons.get(2),newButtons.get(1))).buttonFunction());
        newButtons.get(1).setOnClickListener(new ResumeButton(id,mySongsPlayLists,new ResumeOperation(newButtons.get(0),newButtons.get(2),newButtons.get(1))).buttonFunction());
        newButtons.get(3).setOnClickListener(new FavoriteButton(id,mySongsPlayLists,null).buttonFunction());
    }

    public List<List<Button>> getButtons() {
        return buttons;
    }

    public void setButtons(List<List<Button>> buttons) {
        this.buttons = buttons;
    }

    public List<Button> getListButton(int position){
        return this.buttons.get(position);
    }
}
