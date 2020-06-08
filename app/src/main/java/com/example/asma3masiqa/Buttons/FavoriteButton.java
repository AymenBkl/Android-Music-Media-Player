package com.example.asma3masiqa.Buttons;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Buttons.ButtonStrategy.FavoriteButtonStrategy;
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
                File song = getMySongsPlayLists().songs.get(getId());
                if (favSongController.checkSongExist(song.getAbsolutePath())){
                    favSongController.removeFavSong(song.getAbsolutePath());
                    ((FavoriteButtonStrategy) getButtonsStrategy()).setState(false);
                }
                else {
                    favSongController.addFavSong(new FavSongs(song.getName(), song.getAbsolutePath()));
                    ((FavoriteButtonStrategy) getButtonsStrategy()).setState(true);
                }
                getButtonsStrategy().doOperation();
            }
        };
    }
}
