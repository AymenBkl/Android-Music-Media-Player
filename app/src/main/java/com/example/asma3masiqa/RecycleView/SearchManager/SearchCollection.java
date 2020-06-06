package com.example.asma3masiqa.RecycleView.SearchManager;

import android.util.Log;

import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchCollection {

    private MySongsPlayLists mySongsPlayLists;
    public List<File> searchSongs;
    public SearchCollection(){
        this.mySongsPlayLists = MySongsPlayLists.getMySongsPlayLists();
        this.searchSongs = new ArrayList<File>();
    }

    public void onKeyPressed(String text){
         this.searchSongs = new ArrayList<File>();
        for(File file : this.mySongsPlayLists.songs){
            if (file.getName().toLowerCase().contains(text.toLowerCase())){
                this.searchSongs.add(file);
                Log.i("lol","xd"+file.getName());
            }
        }
    }
}
