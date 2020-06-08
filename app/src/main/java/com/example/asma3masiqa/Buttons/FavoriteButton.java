package com.example.asma3masiqa.Buttons;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Database.Controllers.FavSongController;
import com.example.asma3masiqa.Database.Entities.FavSongs;
import com.example.asma3masiqa.Database.MySongsDataBase;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

import java.io.File;
import java.util.List;


public class FavoriteButton extends MyButtons {
    private FavSongController favSongController;
    public FavoriteButton(int id,MySongsPlayLists mySongsPlayLists, ButtonsStrategy buttonsStrategy) {
        super(mySongsPlayLists, buttonsStrategy);
        setId(id);
        this.favSongController = new FavSongController(MySongsDataBase.getMySongsDataBase(null));
    }

    public View.OnClickListener buttonFunction(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("lol","xdclieckedfavorites");
                File song = getMySongsPlayLists().songs.get(getId());
                favSongController.addFavSong(new FavSongs(song.getName(),song.getAbsolutePath()));
                List<File> songs = favSongController.getFavSongs();
                for(File songe :  songs){
                    Log.i("lol","xd"+songe.getAbsolutePath());
                }
            }
        };
    }
}
