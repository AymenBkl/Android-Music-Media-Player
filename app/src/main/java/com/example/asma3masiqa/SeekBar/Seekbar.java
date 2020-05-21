package com.example.asma3masiqa.SeekBar;

import android.view.View;
import android.widget.SeekBar;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerAdapter;
import com.example.asma3masiqa.Threads.MySeekBarThread;
import com.example.asma3masiqa.Threads.ThreadInializare;

public class Seekbar {

    private SeekBar seekBar;
    private MySeekBarThread seekBarThread;

    public Seekbar(View view, MyMediaPlayerAdapter myMediaPlayerAdapter){
        seekBar = SeekBarFactory.getSeekBar(view);
        this.seekBarThread = (MySeekBarThread) ThreadInializare.inizialize(new MySeekBarThread("My SeekBar Thread"));
        SeekBarListner.setListner(myMediaPlayerAdapter,seekBar);
    }

    public void setMax(int max){
        seekBar.setMax(max);
    }
    public void setProgress(int progress){
        seekBar.setProgress(progress);
    }

    public SeekBar getSeekBar() {
        return seekBar;
    }

    public void setSeekBar(SeekBar seekBar) {
        this.seekBar = seekBar;
    }

    public MySeekBarThread getSeekBarThread() {
        return seekBarThread;
    }

    public void setSeekBarThread(MySeekBarThread seekBarThread) {
        this.seekBarThread = seekBarThread;
    }
}
