package com.example.asma3masiqa.RecycleView.FavoriteFragmentRecycleView;

import android.util.Log;

import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

import java.io.File;
import java.util.List;

public class FavoriteSongsCollection {

    private MySongsPlayLists mySongsPlayLists;
    public List<File> myFavSongs;

    public FavoriteSongsCollection(){
        this.mySongsPlayLists = MySongsPlayLists.getMySongsPlayLists();
    }

    public void update(){
        this.myFavSongs = this.mySongsPlayLists.songs;
    }
}
