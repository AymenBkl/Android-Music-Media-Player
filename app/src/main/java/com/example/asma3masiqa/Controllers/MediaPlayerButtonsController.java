package com.example.asma3masiqa.Controllers;

import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Buttons.ButtonStrategy.NextFromPlayer;
import com.example.asma3masiqa.Buttons.ButtonStrategy.PauseFromPlayer;
import com.example.asma3masiqa.Buttons.ButtonStrategy.PlayFromPlayer;
import com.example.asma3masiqa.Buttons.ButtonStrategy.PrevouisFromPlayer;
import com.example.asma3masiqa.Buttons.FactoryButton.DropDownButton;
import com.example.asma3masiqa.Buttons.FactoryButton.NextFromPlayerButton;
import com.example.asma3masiqa.Buttons.FactoryButton.PauseFromPlayerButton;
import com.example.asma3masiqa.Buttons.FactoryButton.PlayFromPlayerButton;
import com.example.asma3masiqa.Buttons.FactoryButton.PrevouisFromPlayerFactory;
import com.example.asma3masiqa.SongManipulation.DropDownListner;
import com.example.asma3masiqa.SongManipulation.NextListner;
import com.example.asma3masiqa.SongManipulation.PauseListner;
import com.example.asma3masiqa.SongManipulation.PlayListner;
import com.example.asma3masiqa.SongManipulation.PrevouiseListner;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;

public class MediaPlayerButtonsController {

    private Button play;
    private Button pause;
    private Button next;
    private Button prevouis;
    private Button dropDown;

    public MediaPlayerButtonsController(View view,MyMediaPlayerSong myMediaPlayerSong){
        this.play = PlayFromPlayerButton.getButton(view);
        this.pause = PauseFromPlayerButton.getButton(view);
        this.next = NextFromPlayerButton.getButton(view);
        this.prevouis = PrevouisFromPlayerFactory.getButton(view);
        this.dropDown = DropDownButton.getButton(view);
        affectListners(myMediaPlayerSong);


    }

    public void affectListners(MyMediaPlayerSong myMediaPlayerSong){
        this.play.setOnClickListener(new PlayListner(myMediaPlayerSong,new PlayFromPlayer(this.play,this.pause)).onClickListeners());
        this.pause.setOnClickListener(new PauseListner(myMediaPlayerSong,new PauseFromPlayer(this.play,this.pause)).onClickListeners());
        this.next.setOnClickListener(new NextListner(myMediaPlayerSong,new NextFromPlayer(this.play,this.pause,myMediaPlayerSong.getMySongsPlayLists().sizeFile())).onClickListeners());
        this.prevouis.setOnClickListener(new PrevouiseListner(myMediaPlayerSong,new PrevouisFromPlayer(this.play,this.pause)).onClickListeners());
        this.dropDown.setOnClickListener(new DropDownListner(myMediaPlayerSong,null).onClickListeners());
    }

}
