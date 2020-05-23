package com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews;

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

    public final void setTexts(String text1,String text2){
        setSongName(text2);
        setSongDurationTextView(text1);
        setCurrentPositionTextView(text1);
    }
}
