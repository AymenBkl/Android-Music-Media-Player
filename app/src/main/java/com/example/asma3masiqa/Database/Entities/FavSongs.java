package com.example.asma3masiqa.Database.Entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class FavSongs {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private long idFavSong;
    @ColumnInfo(name="songName")
    private String songName;
    @ColumnInfo(name="songUrl")
    private String songUrl;

    public FavSongs(String songName, String songUrl) {
        this.songName = songName;
        this.songUrl = songUrl;
    }

    public long getIdFavSong() {
        return idFavSong;
    }

    public void setIdFavSong(long idFavSong) {
        this.idFavSong = idFavSong;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }
}
