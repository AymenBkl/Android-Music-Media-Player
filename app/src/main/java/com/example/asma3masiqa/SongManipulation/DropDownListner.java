package com.example.asma3masiqa.SongManipulation;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;

public class DropDownListner extends OnClickListner {

    public DropDownListner(MyMediaPlayerSong myMediaPlayerSong, ButtonsStrategy buttonsStrategy) {
        super(myMediaPlayerSong, buttonsStrategy);
    }

    @Override
    public View.OnClickListener onClickListeners() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyFragmentManager.getMyFragmentManager(null).fromSongPlayerToListSong();
                Log.i("lol","xdimclicked");
            }
        };
    }
}
