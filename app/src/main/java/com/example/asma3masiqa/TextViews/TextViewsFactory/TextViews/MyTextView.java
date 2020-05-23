package com.example.asma3masiqa.TextViews.TextViewsFactory.TextViews;

import android.widget.TextView;

public abstract class MyTextView {

    private TextView textView;

    public abstract void setText(String text);

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }
}
