package com.example.asma3masiqa.Controllers;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Buttons.ButtonStrategy.NextFromPlayer;
import com.example.asma3masiqa.Buttons.ButtonStrategy.NextOperation;
import com.example.asma3masiqa.Buttons.ButtonStrategy.PauseFromPlayer;
import com.example.asma3masiqa.Buttons.ButtonStrategy.PlayFromPlayer;
import com.example.asma3masiqa.Buttons.ButtonStrategy.PrevouisFromPlayer;
import com.example.asma3masiqa.Buttons.FactoryButton.NextFromPlayerButton;
import com.example.asma3masiqa.Buttons.FactoryButton.PauseButtonFactory;
import com.example.asma3masiqa.Buttons.FactoryButton.PlayButtonFactory;
import com.example.asma3masiqa.Buttons.FactoryButton.PrevouisFromPlayerFactory;
import com.example.asma3masiqa.Buttons.NextButton;
import com.example.asma3masiqa.Buttons.PauseButtomFromPlayer;
import com.example.asma3masiqa.Buttons.PlayButtonFromPlayer;
import com.example.asma3masiqa.Buttons.PrevouisButton;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public class MediaPlayerButtonsController {

    private Button play;
    private Button pause;
    private Button next;
    private Button prevouis;

    public MediaPlayerButtonsController(View view,MySongsPlayLists mySongsPlayLists){
        Log.i("lol","xdim here");
        this.play = PlayButtonFactory.getButton(view);
        this.pause = PauseButtonFactory.getButton(view);
        this.next = NextFromPlayerButton.getButton(view);
        this.prevouis = PrevouisFromPlayerFactory.getButton(view);
        Log.i("lol","xdim here3");
        affectListners(mySongsPlayLists);
        Log.i("lol","xdim here4");


    }

    public void affectListners(MySongsPlayLists mySongsPlayLists){
        this.play.setOnClickListener((new PlayButtonFromPlayer(mySongsPlayLists,new PlayFromPlayer(this.play,this.pause,this.next))).buttonFunction());
        this.pause.setOnClickListener((new PauseButtomFromPlayer(mySongsPlayLists,new PauseFromPlayer(this.play,this.pause,this.next))).buttonFunction());
        this.next.setOnClickListener((new NextButton(mySongsPlayLists,new NextFromPlayer(this.play,this.pause,this.next,mySongsPlayLists.sizeFile()))).buttonFunction());
        this.prevouis.setOnClickListener((new PrevouisButton(mySongsPlayLists,new PrevouisFromPlayer(this.play,this.pause,this.next))).buttonFunction());

    }

}
