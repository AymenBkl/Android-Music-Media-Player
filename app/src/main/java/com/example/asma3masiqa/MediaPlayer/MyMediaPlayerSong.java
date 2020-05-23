package com.example.asma3masiqa.MediaPlayer;

import android.os.Environment;
import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Controllers.MediaPlayerButtonsController;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;
import com.example.asma3masiqa.SeekBar.SeekBarAdapter;
import com.example.asma3masiqa.SeekBar.Seekbar;
import com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews.MyTextViewAdapter;

import java.io.File;

public class MyMediaPlayerSong {

    private MySongsPlayLists mySongsPlayLists;
    private SeekBarAdapter seekBarAdapter;
    private MediaPlayerButtonsController mediaPlayerButtonsController;
    private MyTextViewAdapter myTextViewAdapter;

    public MyMediaPlayerSong(View view){
        this.mySongsPlayLists = MySongsPlayLists.getMySongsPlayLists();
        this.seekBarAdapter = new SeekBarAdapter(new Seekbar(view,this.mySongsPlayLists.getMyMediaPlayerAdapter()));
        this.mediaPlayerButtonsController = new MediaPlayerButtonsController(view,this);
        this.myTextViewAdapter = new MyTextViewAdapter(view);
    }

    public void seekBarManipulaition(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                    seekBarAdapter.mainFunction(mySongsPlayLists.getMyMediaPlayerAdapter(),myTextViewAdapter);

            }
        };
        this.seekBarAdapter.assignTask(runnable);
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
