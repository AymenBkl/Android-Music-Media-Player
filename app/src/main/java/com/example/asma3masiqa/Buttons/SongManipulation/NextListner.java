package com.example.asma3masiqa.Buttons.SongManipulation;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Controllers.VisibilityController;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;

public class NextListner extends OnClickListner {
    private int size;
    public NextListner(MyMediaPlayerSong myMediaPlayerSong, Button play , Button pause ) {
        super(myMediaPlayerSong,play,pause);
        this.size = myMediaPlayerSong.getMySongsPlayLists().sizeFile();
    }

    @Override
    public View.OnClickListener onClickListeners() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Runnable r = new Runnable() {
                    @Override
                    public void run() {
                        if (checks(getCurrentSong())) {
                            getMyMediaPlayerSong().playMySong(getCurrentSong()+1);
                            setCurrentSong(getCurrentSong()+1);

                        }
                        Log.i("lol","xdnextListner");

                    }
                };

                getMyMediaPlayerSong().getMySongsPlayLists().getMyMedeaPlayerThread().assignTask(r);


            }
        };
    }

    private boolean checks(int position){
        return position < this.size;
    }

    private void switchView(){

        VisibilityController.visibilityToIVisible(getPause());
        VisibilityController.visibilityToInvisible(getPlay());
    }


}
