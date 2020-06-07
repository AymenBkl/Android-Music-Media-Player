package com.example.asma3masiqa.SongManipulation;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Buttons.ButtonStrategy.DropDownStrategy;
import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

import java.io.File;

public class SearchViewListner extends OnClickListner {

    private File song;
    public SearchViewListner(MyMediaPlayerSong myMediaPlayerSong, ButtonsStrategy buttonsStrategy, File song) {
        super(myMediaPlayerSong, buttonsStrategy);
        this.song = song;
    }

    @Override
    public View.OnClickListener onClickListeners() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = MySongsPlayLists.getMySongsPlayLists().songs.indexOf(song);
                FragmentCommunication.getFragmentCommunication().setCurrentSong(position);
                MyFragmentManager.getMyFragmentManager(null).fromSongListToSongPlayer();
                DropDownStrategy.fromSongListToSongPlayer();
            }
        };
    }
}
