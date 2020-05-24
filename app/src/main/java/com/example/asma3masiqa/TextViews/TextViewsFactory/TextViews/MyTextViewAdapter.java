package com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews;

import android.util.Log;
import android.view.View;

public class MyTextViewAdapter {

    private SongDurationTextView songDurationTextView;
    private SongNameTextView songNameTextView;
    private CurrentPositionTextView currentPositionTextView;

    public MyTextViewAdapter(View view){
        this.songDurationTextView = new SongDurationTextView(view);
        this.currentPositionTextView = new CurrentPositionTextView(view);
        this.songNameTextView = new SongNameTextView(view);
    }

    private void setSongName(String text){
        this.songNameTextView.setText(text);
    }
    private void setSongDurationTextView(String text){
        this.songDurationTextView.setText(text);
    }
    public void setCurrentPositionTextView(String text){
        this.currentPositionTextView.setText(text);
    }

    public void setTexts(final String text1,final String text2,final String text3){


                Log.i("lol","xd"+Thread.currentThread());
                setSongName("XD");
                setSongDurationTextView("lol");
                setCurrentPositionTextView("mm");


    }
}
