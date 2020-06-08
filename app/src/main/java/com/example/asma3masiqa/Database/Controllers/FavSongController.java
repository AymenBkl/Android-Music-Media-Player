package com.example.asma3masiqa.Database.Controllers;

import com.example.asma3masiqa.Database.DOA.SongFavRepository;
import com.example.asma3masiqa.Database.Entities.FavSongs;
import com.example.asma3masiqa.Database.MySongsDataBase;

import java.util.List;

public class FavSongController {

    private SongFavRepository songFavRepository;

    public FavSongController(MySongsDataBase mySongsDataBase){
        this.songFavRepository = mySongsDataBase.songFavRepository();
    }

    public List<FavSongs> getFavSongs(){
        return this.songFavRepository.getAllFavsongs();
    }

    public void addFavSong(FavSongs favSong){
        this.songFavRepository.inserFavSong(favSong);
    }

    public boolean checkSongExist(String uri){
        FavSongs favSongs = this.songFavRepository.getFavSong(uri);

        if (favSongs == null){
            return false;
        }
        else {
            return true;
        }

    }
}
