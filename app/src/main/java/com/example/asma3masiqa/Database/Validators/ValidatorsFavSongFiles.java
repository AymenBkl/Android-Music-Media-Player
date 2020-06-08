package com.example.asma3masiqa.Database.Validators;

import com.example.asma3masiqa.Database.Controllers.FavSongController;
import com.example.asma3masiqa.Database.Entities.FavSongs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ValidatorsFavSongFiles {


    public List<File> validate(List<FavSongs> favSongs, FavSongController favSongController){
        List<File> songs = new ArrayList<File>();
        for(FavSongs favSong : favSongs){
            File song = new File((favSong.getSongUrl()));
            if (song.exists()){
                songs.add(song);
            }
            else {
                favSongController.removeFavSong(favSong);
            }
        }
        return songs;
    }

}
