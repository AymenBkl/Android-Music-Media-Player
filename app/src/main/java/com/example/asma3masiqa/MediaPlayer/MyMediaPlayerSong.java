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

    public MyMediaPlayerSong(View view){
        this.mySongsPlayLists = new MySongsPlayLists(new File(Environment.getExternalStorageDirectory()+"/Music").listFiles());
        this.seekBarAdapter = new SeekBarAdapter(new Seekbar(view,this.mySongsPlayLists.getMyMediaPlayerAdapter()));
        this.mediaPlayerButtonsController = new MediaPlayerButtonsController(view,this);
    }

    private void seekBarManipulaition(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    seekBarAdapter.mainFunction(mySongsPlayLists.getMyMediaPlayerAdapter());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        this.seekBarAdapter.assignTask(runnable);
    }
    private void playSong(int position){
        mySongsPlayLists.playSong(position);

    }

    public void playMySong(int position){
        playSong(position);
        seekBarManipulaition();

    }

    public MySongsPlayLists getMySongsPlayLists() {
        return mySongsPlayLists;
    }

    public void setMySongsPlayLists(MySongsPlayLists mySongsPlayLists) {
        this.mySongsPlayLists = mySongsPlayLists;
    }
}
