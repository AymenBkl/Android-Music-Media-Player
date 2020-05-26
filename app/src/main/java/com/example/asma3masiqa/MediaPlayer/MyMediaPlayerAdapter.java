package com.example.asma3masiqa.MediaPlayer;

import android.media.MediaPlayer;


import java.io.IOException;

public class MyMediaPlayerAdapter {
    private MediaPlayer mediaPlayer;
    public MyMediaPlayerAdapter(){
        mediaPlayer = new MediaPlayer();
    }

    public void prepareSong(String songPath){
        mediaPlayer.stop();
        mediaPlayer.reset();

        try {
            mediaPlayer.setDataSource(songPath);
            mediaPlayer.setLooping(true);
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
    public int getDuration(){
        if (mediaPlayer.isPlaying()){
            return mediaPlayer.getDuration();
        }
        else {
            return 0;
        }
    }

    public int currentPosition(){
            return mediaPlayer.getCurrentPosition();
    }

    public void goToPosition(int position){
        mediaPlayer.seekTo(position);
    }

}
