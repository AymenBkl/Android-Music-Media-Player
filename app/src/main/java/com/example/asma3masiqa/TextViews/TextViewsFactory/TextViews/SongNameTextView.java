package com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews;

import android.view.View;

import com.example.asma3masiqa.TextViews.TextViewsFactory.SongCurrentPositionFactory;
import com.example.asma3masiqa.TextViews.TextViewsFactory.SongNameFactory;

public class SongNameTextView extends MyTextView {
    public SongNameTextView(View view){
        setTextView(SongNameFactory.getTextView(view));
    }
    @Override
    public void setText(String text) {
        getTextView().setText(text);
    }
}
