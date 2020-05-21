package com.example.asma3masiqa.SeekBar;

import android.view.View;
import android.widget.SeekBar;

import com.example.asma3masiqa.R;

public class SeekBarFactory {

    public static SeekBar getSeekBar(View view){
        return (SeekBar) view.findViewById(R.id.myseekbar);
    }
}
