package com.example.asma3masiqa.MediaPlayer;

import android.media.MediaPlayer;
import android.os.HandlerThread;
import android.util.Log;

import java.io.IOException;

public class MyMediaPlayerAdapter {
    private MediaPlayer mediaPlayer;
    public MyMediaPlayerAdapter(){
        mediaPlayer = new MediaPlayer();
    }

    public void prepareSong(String songPath){
        Log.i("lol","xdimheremedeaplayer");
        if (mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.reset();
        }
        try {
            mediaPlayer.setDataSource(songPath);
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void play(){
        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
    }

    public void pause(){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

}
