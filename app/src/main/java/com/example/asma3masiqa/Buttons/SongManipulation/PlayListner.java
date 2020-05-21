package com.example.asma3masiqa.Buttons.SongManipulation;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Controllers.VisibilityController;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;


public class PlayListner extends OnClickListner {

    public PlayListner(MyMediaPlayerSong myMediaPlayerSong, Button play, Button pause) {
        super(myMediaPlayerSong,play,pause);
    }



    @Override
    public View.OnClickListener onClickListeners() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        getMyMediaPlayerSong().getMySongsPlayLists().resumeSong();
                        Log.i("lol","xdnextListner");

                    }
                };
                getMyMediaPlayerSong().getMySongsPlayLists().getMyMedeaPlayerThread().assignTask(r);
            }
        };
    }

    private void switchView(){
        Log.i("lol","xdview");
        VisibilityController.visibilityToInvisible(getPlay());
        VisibilityController.visibilityToIVisible(getPause());

        Log.i("lol","xdview");


    }
}
