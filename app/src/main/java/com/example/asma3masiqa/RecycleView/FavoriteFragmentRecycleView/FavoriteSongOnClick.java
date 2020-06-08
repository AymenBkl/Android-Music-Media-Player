package com.example.asma3masiqa.RecycleView.FavoriteFragmentRecycleView;

import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.DropDownStrategy;
import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

import java.io.File;

public class FavoriteSongOnClick {

    public View.OnClickListener setListner(final File song){
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
