package com.example.asma3masiqa.MediaPlayer;

import android.os.Environment;
import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Controllers.MediaPlayerButtonsController;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;
import com.example.asma3masiqa.SeekBar.SeekBarAdapter;
import com.example.asma3masiqa.SeekBar.Seekbar;

import java.io.File;

public class MyMediaPlayerSong {

    private MySongsPlayLists mySongsPlayLists;
    private SeekBarAdapter seekBarAdapter;
    private MediaPlayerButtonsController mediaPlayerButtonsController;

    public MyMediaPlayerSong(MainActivity mainActivity){
        this.mySongsPlayLists = new MySongsPlayLists(new File(Environment.getExternalStorageDirectory()+"/Music").listFiles());
        this.seekBarAdapter = new SeekBarAdapter(new Seekbar(mainActivity,this.mySongsPlayLists.getMyMediaPlayerAdapter()));
        this.mediaPlayerButtonsController = new MediaPlayerButtonsController(mainActivity.findViewById(R.id.mysongLayout),this.mySongsPlayLists);
    }

    private void seekBarManipulaition(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                seekBarAdapter.mainFunction(mySongsPlayLists.getMyMediaPlayerAdapter());
            }
        };
        this.mySongsPlayLists.getMyMedeaPlayerThread().assignTask(runnable);
    }
    private void playSong(int position){
        mySongsPlayLists.playSong(position);
    }

    public void playMySong(int position){
        playSong(position);
        seekBarManipulaition();

    }

}
