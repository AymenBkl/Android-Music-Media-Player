package com.example.asma3masiqa.SeekBar;

import android.widget.SeekBar;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerAdapter;

public class Seekbar {

    private SeekBar seekBar;

    public Seekbar(MainActivity mainActivity, MyMediaPlayerAdapter myMediaPlayerAdapter){
        seekBar = SeekBarFactory.getSeekBar(mainActivity);
        SeekBarListner.setListner(myMediaPlayerAdapter,seekBar);
    }

    public void setMax(int max){
        seekBar.setMax(max);
    }
    public void setProgress(int progress){
        seekBar.setProgress(progress);
    }

}
