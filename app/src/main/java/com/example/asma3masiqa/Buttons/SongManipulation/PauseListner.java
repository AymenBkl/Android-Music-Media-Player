package com.example.asma3masiqa.Buttons.SongManipulation;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Controllers.VisibilityController;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;

public class PauseListner  extends  OnClickListner{


    public PauseListner(MyMediaPlayerSong myMediaPlayerSong, Button play, Button pause) {
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
                        getMyMediaPlayerSong().getMySongsPlayLists().pauseSong();
                        Log.i("lol","xdnextListner");

                    }
                };
                getMyMediaPlayerSong().getMySongsPlayLists().getMyMedeaPlayerThread().assignTask(r);
            }
        };
    }

    private void switchView(){
        Log.i("lol","xdnextListnersssssssssss");

        VisibilityController.visibilityToIVisible(getPlay());
        VisibilityController.visibilityToInvisible(getPause());

    }
}
