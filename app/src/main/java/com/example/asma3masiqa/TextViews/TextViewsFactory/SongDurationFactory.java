package com.example.asma3masiqa.TextViews.TextViewsFactory;

import android.view.View;
import android.widget.TextView;

import com.example.asma3masiqa.R;

public class SongDurationFactory extends TextViewsFactory {

    public static TextView getTextView(View view){
        return (TextView) view.findViewById(R.id.songDuration);
    }
}
