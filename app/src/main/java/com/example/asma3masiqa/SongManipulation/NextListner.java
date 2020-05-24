package com.example.asma3masiqa.SongManipulation;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Buttons.ButtonStrategy.NextFromPlayer;
import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;

public class NextListner extends OnClickListner {
    private int size;

    public NextListner(MyMediaPlayerSong myMediaPlayerSong, ButtonsStrategy buttonsStrategy) {
        super(myMediaPlayerSong, buttonsStrategy);
        this.size = myMediaPlayerSong.getMySongsPlayLists().sizeFile();
    }

    @Override
    public View.OnClickListener onClickListeners() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCurrentSong(FragmentCommunication.getFragmentCommunication().getCurrentSong());
                if (((NextFromPlayer) getButtonsStrategy()).checks(getCurrentSong())){
                    setCurrentSong(getCurrentSong() +1);
                    FragmentCommunication.getFragmentCommunication().setCurrentSong(getCurrentSong());
                    MyFragmentManager.getMyFragmentManager(null).fromSongListToSongPlayer();
                    getButtonsStrategy().doOperation();
                }

            }

        };
    }
}





