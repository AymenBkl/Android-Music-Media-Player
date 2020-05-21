package com.example.asma3masiqa.SeekBar;

import android.widget.SeekBar;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;

public class SeekBarFactory {

    public static SeekBar getSeekBar(MainActivity mainActivity){
        return (SeekBar) mainActivity.findViewById(R.id.myseekbar);
    }
}
