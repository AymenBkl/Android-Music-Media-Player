package com.example.asma3masiqa.MediaPlayer;


import com.example.asma3masiqa.Files.FileE;
import com.example.asma3masiqa.Threads.MyMedeaPlayerThread;
import com.example.asma3masiqa.Threads.ThreadInializare;

import java.io.File;


public class MySongsPlayLists {

    private MyMediaPlayerAdapter myMediaPlayerAdapter;
    public File[] songs;
    private MyMedeaPlayerThread myMedeaPlayerThread;

    public MySongsPlayLists(File[] songs){
        this.myMediaPlayerAdapter = new MyMediaPlayerAdapter();
        this.songs = songs;
        myMedeaPlayerThread = (MyMedeaPlayerThread) ThreadInializare.inizialize(new MyMedeaPlayerThread("MedeaPlayerThread"));
    }

    public void playSong(final int position){
         Runnable runnable = new Runnable() {
            @Override
            public void run() {
                myMediaPlayerAdapter.prepareSong(songs[position].getAbsolutePath());
                myMediaPlayerAdapter.play();
            }
        };
         myMedeaPlayerThread.assignTask(runnable);
    }
    public void pauseSong(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                myMediaPlayerAdapter.pause();
            }
        };
        myMedeaPlayerThread.assignTask(runnable);
    }

    public void resumeSong(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                myMediaPlayerAdapter.play();
            }
        };
        myMedeaPlayerThread.assignTask(runnable);
    }
}
