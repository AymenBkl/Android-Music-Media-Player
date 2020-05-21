package com.example.asma3masiqa.Controllers;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Buttons.FactoryButton.NextFromPlayerButton;
import com.example.asma3masiqa.Buttons.FactoryButton.PauseFromPlayerButton;
import com.example.asma3masiqa.Buttons.FactoryButton.PlayFromPlayerButton;
import com.example.asma3masiqa.Buttons.FactoryButton.PrevouisFromPlayerFactory;
import com.example.asma3masiqa.Buttons.SongManipulation.NextListner;
import com.example.asma3masiqa.Buttons.SongManipulation.PauseListner;
import com.example.asma3masiqa.Buttons.SongManipulation.PlayListner;
import com.example.asma3masiqa.Buttons.SongManipulation.PrevouiseListner;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public class MediaPlayerButtonsController {

    private Button play;
    private Button pause;
    private Button next;
    private Button prevouis;

    public MediaPlayerButtonsController(View view,MyMediaPlayerSong myMediaPlayerSong){
        this.play = PlayFromPlayerButton.getButton(view);
        this.pause = PauseFromPlayerButton.getButton(view);
        this.next = NextFromPlayerButton.getButton(view);
        this.prevouis = PrevouisFromPlayerFactory.getButton(view);
        affectListners(myMediaPlayerSong);


    }

    public void affectListners(MyMediaPlayerSong myMediaPlayerSong){
        this.play.setOnClickListener(new PlayListner(myMediaPlayerSong,this.play,this.pause).onClickListeners());
        this.pause.setOnClickListener(new PauseListner(myMediaPlayerSong,this.play,this.pause).onClickListeners());
        this.next.setOnClickListener(new NextListner(myMediaPlayerSong,this.play,this.pause).onClickListeners());
        this.prevouis.setOnClickListener(new PrevouiseListner(myMediaPlayerSong,this.play,this.pause).onClickListeners());

    }

}
