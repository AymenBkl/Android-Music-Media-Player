package com.example.asma3masiqa.Interaction;

import android.widget.SeekBar;

import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerAdapter;

public class SeekBarListner {

    public static void setListner(final MyMediaPlayerAdapter myMediaPlayerAdapter,SeekBar seekBar){
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (b) {
                    myMediaPlayerAdapter.goToPosition(i * 10);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
    });
}
}
