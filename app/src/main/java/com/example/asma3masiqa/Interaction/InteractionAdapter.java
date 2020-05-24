package com.example.asma3masiqa.Interaction;

import android.util.Log;

import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerAdapter;
import com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews.MyTextViewAdapter;

public class InteractionAdapter {
    private Interaction seekBar;
    public InteractionAdapter(Interaction seekBar){
        this.seekBar = seekBar;
    }

    public void mainFunction(MyMediaPlayerAdapter myMediaPlayerAdapter) {
        final int interval = 10;
        int totalDuration = myMediaPlayerAdapter.getDuration();
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
