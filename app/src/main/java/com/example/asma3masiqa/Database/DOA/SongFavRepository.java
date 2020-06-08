package com.example.asma3masiqa.Database.DOA;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.asma3masiqa.Database.Entities.FavSongs;

import java.util.List;

@Dao
public interface SongFavRepository {

    @Insert
    long inserFavSong(FavSongs favSong);

    @Query("SELECT * FROM favsongs")
    List<FavSongs> getAllFavsongs();

    @Query("DELETE FROM favsongs where songUrl = :songUri")
    void removeFavSong(String songUri);

    @Query("SELECT * FROM favsongs WHERE songUrl = :songUri")
    FavSongs getFavSong(String songUri);
}
