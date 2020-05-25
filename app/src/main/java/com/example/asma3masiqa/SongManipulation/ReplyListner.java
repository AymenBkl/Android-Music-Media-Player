package com.example.asma3masiqa.SongManipulation;

import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;

public class ReplyListner extends OnClickListner{

    public ReplyListner(MyMediaPlayerSong myMediaPlayerSong, ButtonsStrategy buttonsStrategy) {
        super(myMediaPlayerSong, buttonsStrategy);
    }

    @Override
    public View.OnClickListener onClickListeners() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMyMediaPlayerSong().playMySong(FragmentCommunication.getFragmentCommunication().getCurrentSong());
            }
        };
    }
}
