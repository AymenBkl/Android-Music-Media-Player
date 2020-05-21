package com.example.asma3masiqa.SeekBar;

import android.util.Log;

import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerAdapter;

public class SeekBarAdapter {
    private Seekbar seekBar;

    public SeekBarAdapter(Seekbar seekBar){
        this.seekBar = seekBar;
    }

    public void mainFunction(MyMediaPlayerAdapter myMediaPlayerAdapter) throws InterruptedException {
        Thread.sleep(1000);
        final int interval = 10;
        int totalDuration = myMediaPlayerAdapter.getDuration();
        Log.i("lol","xd"+totalDuration);
        int currentPosition = 0;
        seekBar.setMax(totalDuration/interval);

        while (currentPosition < totalDuration){
            try{
                currentPosition = myMediaPlayerAdapter.currentPosition()/interval;
                seekBar.setProgress(currentPosition);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    public void assignTask(Runnable r){
        seekBar.getSeekBarThread().assignTask(r);
    }
}
