package com.example.asma3masiqa.SeekBar;

import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerAdapter;

public class SeekBarAdapter {
    private Seekbar seekBar;

    public SeekBarAdapter(Seekbar seekBar){
        this.seekBar = seekBar;
    }

    public void mainFunction(MyMediaPlayerAdapter myMediaPlayerAdapter){
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
}
