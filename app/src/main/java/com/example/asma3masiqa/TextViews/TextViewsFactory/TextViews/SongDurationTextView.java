package com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews;

import android.view.View;

import com.example.asma3masiqa.TextViews.TextViewsFactory.SongCurrentPositionFactory;
import com.example.asma3masiqa.TextViews.TextViewsFactory.SongDurationFactory;

public class SongDurationTextView extends MyTextView {
    public SongDurationTextView(View view){
        setTextView(SongDurationFactory.getTextView(view));
    }
    @Override
    public void setText(String text) {
        getTextView().setText(text);
    }
}
