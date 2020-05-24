package com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.TextViews.TextViewsFactory.SongCurrentPositionFactory;

public class CurrentPositionTextView extends MyTextView {
    public CurrentPositionTextView(View view){
        setTextView(SongCurrentPositionFactory.getTextView(view));
    }
    @Override
    public void setText(String text) {
        getTextView().setText(text);
    }
}
