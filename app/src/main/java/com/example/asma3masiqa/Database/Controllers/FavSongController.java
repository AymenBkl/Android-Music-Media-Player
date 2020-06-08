package com.example.asma3masiqa.Database.Controllers;

import com.example.asma3masiqa.Database.DOA.SongFavRepository;
import com.example.asma3masiqa.Database.Entities.FavSongs;
import com.example.asma3masiqa.Database.MySongsDataBase;
import com.example.asma3masiqa.Database.Validators.ValidatorsFavSongFiles;

import java.io.File;
import java.util.List;

public class FavSongController {

    private SongFavRepository songFavRepository;
    private ValidatorsFavSongFiles validatorsFavSongFiles;
    public FavSongController(MySongsDataBase mySongsDataBase){
        this.songFavRepository = mySongsDataBase.songFavRepository();
        this.validatorsFavSongFiles = new ValidatorsFavSongFiles();
    }

    public List<File> getFavSongs(){
        return this.validatorsFavSongFiles.validate(this.songFavRepository.getAllFavsongs(),this);
    }

    public void addFavSong(FavSongs favSong){
        this.songFavRepository.inserFavSong(favSong);
    }
    public void removeFavSong(FavSongs favSongs){
        this.removeFavSong(favSongs);
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
