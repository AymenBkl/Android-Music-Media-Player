package com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.TextViews.TextViewsFactory.SongCurrentPositionFactory;
import com.example.asma3masiqa.TextViews.TextViewsFactory.SongDurationFactory;

public class SongDurationTextView extends MyTextView {

    public SongDurationTextView(View view){
        setTextView(SongDurationFactory.getTextView(view));
    }
    @Override
    public void setText(String text) {
        int duration = Integer.valueOf(text)/1000;
        text = String.valueOf(duration/60) + ":" + String.valueOf(duration%60);
        getTextView().setText(text);
    }
}
