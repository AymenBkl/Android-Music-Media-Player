package com.example.asma3masiqa.Interaction;

import android.util.Log;
import android.view.View;
import android.widget.SeekBar;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerAdapter;
import com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews.MyTextViewAdapter;
import com.example.asma3masiqa.Threads.MyInterectionThread;
import com.example.asma3masiqa.Threads.ThreadInializare;

public class Interaction {

    private SeekBar seekBar;
    private MyInterectionThread seekBarThread;
    private MyTextViewAdapter myTextViewAdapter;

    public Interaction(View view, MyMediaPlayerAdapter myMediaPlayerAdapter){
        seekBar = SeekBarFactory.getSeekBar(view);
        this.myTextViewAdapter = new MyTextViewAdapter(view);
        this.seekBarThread = (MyInterectionThread) ThreadInializare.inizialize(MyInterectionThread.getMyThread());
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

    public MyInterectionThread getSeekBarThread() {
        return seekBarThread;
    }

    public void setSeekBarThread(MyInterectionThread seekBarThread) {
        this.seekBarThread = seekBarThread;
    }

    public Runnable setTexts(String text,String text1){
        return this.myTextViewAdapter.setTexts(text,text1);
    }
    public Runnable setCurrentText(String text){
        return this.myTextViewAdapter.setCurrentPositionTextView(text);
    }


}
