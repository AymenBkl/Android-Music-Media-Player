package com.example.asma3masiqa.MediaPlayer;

import android.view.View;

import com.example.asma3masiqa.Controllers.MediaPlayerButtonsController;
import com.example.asma3masiqa.Interaction.InteractionAdapter;
import com.example.asma3masiqa.Interaction.Interaction;
import com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews.MyTextViewAdapter;

public class MyMediaPlayerSong {

    private MySongsPlayLists mySongsPlayLists;
    private InteractionAdapter interactionAdapter;
    private MediaPlayerButtonsController mediaPlayerButtonsController;

    public MyMediaPlayerSong(View view){
        this.mySongsPlayLists = MySongsPlayLists.getMySongsPlayLists();
        this.interactionAdapter = new InteractionAdapter(new Interaction(view,this.mySongsPlayLists.getMyMediaPlayerAdapter()));
        this.mediaPlayerButtonsController = new MediaPlayerButtonsController(view,this);

    }

    public void seekBarManipulaition(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                    interactionAdapter.mainFunction(mySongsPlayLists.getMyMediaPlayerAdapter());

            }
        };
        this.interactionAdapter.assignTask(runnable);
    }


    public void playMySong(int position){
        mySongsPlayLists.playSong(position,this);
    }

    public MySongsPlayLists getMySongsPlayLists() {
        return mySongsPlayLists;
    }

    public void setMySongsPlayLists(MySongsPlayLists mySongsPlayLists) {
        this.mySongsPlayLists = mySongsPlayLists;
    }
}
