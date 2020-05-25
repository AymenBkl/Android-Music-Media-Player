package com.example.asma3masiqa.MySongsFiles;

import android.util.Log;

import java.io.File;
import java.util.List;

public class MySortAdapter {
    private MySongsCollections mySongsCollections;
    private SortSongDate sortSongDate;
    private SortSongName sortSongName;
    private SortSongSize sortSongSize;

    public MySortAdapter(){
        this.mySongsCollections = new MySongsCollections();
        this.sortSongDate = new SortSongDate();
        this.sortSongName = new SortSongName();
        this.sortSongSize  = new SortSongSize();
    }

    public List<File> getMySongs(String option){
        switch (option) {
            case "name" :
                return this.sortSongName.sortSongs(this.mySongsCollections.getMysongs());

            case "size":
                return this.sortSongSize.sortSongs(this.mySongsCollections.getMysongs());
            case "date":
                return this.sortSongDate.sortSongs(this.mySongsCollections.getMysongs());
            default :
                return this.mySongsCollections.getMysongs();
        }
    }
}
