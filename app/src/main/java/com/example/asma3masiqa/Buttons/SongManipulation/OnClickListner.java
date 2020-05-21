package com.example.asma3masiqa.Buttons.SongManipulation;

import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public abstract class OnClickListner  {
    private MyMediaPlayerSong myMediaPlayerSong;
    private int currentSong;
    private Button play;
    private Button pause;

    public OnClickListner(MyMediaPlayerSong myMediaPlayerSong,Button play,Button pause){
        this.myMediaPlayerSong = myMediaPlayerSong;
        this.currentSong = 16;
    }
    public abstract View.OnClickListener onClickListeners();

    public MyMediaPlayerSong getMyMediaPlayerSong() {
        return myMediaPlayerSong;
    }

    public void setMyMediaPlayerSong(MyMediaPlayerSong myMediaPlayerSong) {
        this.myMediaPlayerSong = myMediaPlayerSong;
    }

    public int getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(int currentSong) {
        this.currentSong = currentSong;
    }

    public Button getPlay() {
        return play;
    }

    public void setPlay(Button play) {
        this.play = play;
    }

    public Button getPause() {
        return pause;
    }

    public void setPause(Button pause) {
        this.pause = pause;
    }
}
