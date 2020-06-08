package com.example.asma3masiqa.Buttons.FactoryButton;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Database.Controllers.FavSongController;
import com.example.asma3masiqa.Database.MySongsDataBase;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;
import com.example.asma3masiqa.R;

import java.io.File;

public class FavoriteButtonFactory extends ButtonsFactory {
    private static int id = 0;
    public static Button getButton(View view){
        Button btn =  (Button) view.findViewById(R.id.favorite);
        File file = MySongsPlayLists.getMySongsPlayLists().songs.get(id);
        FavSongController favSongController = new FavSongController(MySongsDataBase.getMySongsDataBase(null));
        if (favSongController.checkSongExist(file.getAbsoluteFile().toString())){
            btn.setBackgroundResource(R.drawable.ic_favorite_black_24dp);
        }
        id++;
        return btn;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        FavoriteButtonFactory.id = id;
    }
}
