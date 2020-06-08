package com.example.asma3masiqa.RecycleView.FavoriteFragmentRecycleView;

import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

import java.io.File;
import java.util.List;

public class FavoriteSongsCollection {

    private MySongsPlayLists mySongsPlayLists;
    public List<File> myFavSongs;

    public FavoriteSongsCollection(){
        this.mySongsPlayLists = MySongsPlayLists.getMySongsPlayLists();
        this.myFavSongs = mySongsPlayLists.songs;
    }
}
