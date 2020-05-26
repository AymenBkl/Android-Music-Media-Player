package com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

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
    public Runnable setCurrentPositionTextView(final String text){
        return new Runnable() {
            @Override
            public void run() {
                currentPositionTextView.setText(text);
            }
        };
    }

    public Runnable setTexts(final String text1,final String text2){
        final String songName = MySongsPlayLists.getMySongsPlayLists().songs.get(FragmentCommunication.getFragmentCommunication().getCurrentSong()).getName();
        return new Runnable() {
            @Override
            public void run() {
                setSongName(songName);
                setSongDurationTextView(text1);
                setCurrentPositionTextView(text2);
            }
        };
    }
}
