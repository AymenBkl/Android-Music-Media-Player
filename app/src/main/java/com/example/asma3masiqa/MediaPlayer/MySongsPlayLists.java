package com.example.asma3masiqa.MediaPlayer;


import android.os.Environment;
import android.os.HandlerThread;
import android.util.Log;
import android.widget.SeekBar;

import com.example.asma3masiqa.Files.FileE;
import com.example.asma3masiqa.Threads.MyMedeaPlayerThread;
import com.example.asma3masiqa.Threads.ThreadInializare;

import java.io.File;


public class MySongsPlayLists {

    private MyMediaPlayerAdapter myMediaPlayerAdapter;
    public File[] songs;
    private MyMedeaPlayerThread myMedeaPlayerThread;
    private static MySongsPlayLists mySongsPlayLists;

    private MySongsPlayLists(){
        this.myMediaPlayerAdapter = new MyMediaPlayerAdapter();
        this.songs = new File(Environment.getExternalStorageDirectory()+"/Music").listFiles();
        myMedeaPlayerThread = (MyMedeaPlayerThread) ThreadInializare.inizialize(new MyMedeaPlayerThread("MedeaPlayerThread"));
    }

    public void playSong(final int position, final MyMediaPlayerSong myMediaPlayerSong){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                myMediaPlayerAdapter.prepareSong(songs[position].getAbsolutePath());
                myMediaPlayerAdapter.play();
            }
        };
         myMedeaPlayerThread.assignTask(runnable);
         myMediaPlayerSong.seekBarManipulaition();

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


    public MyMediaPlayerAdapter getMyMediaPlayerAdapter() {
        return myMediaPlayerAdapter;
    }

    public void setMyMediaPlayerAdapter(MyMediaPlayerAdapter myMediaPlayerAdapter) {
        this.myMediaPlayerAdapter = myMediaPlayerAdapter;
    }

    public MyMedeaPlayerThread getMyMedeaPlayerThread() {
        return myMedeaPlayerThread;
    }

    public void setMyMedeaPlayerThread(MyMedeaPlayerThread myMedeaPlayerThread) {
        this.myMedeaPlayerThread = myMedeaPlayerThread;
    }

    public int sizeFile(){
        return this.songs.length;
    }

    public static MySongsPlayLists getMySongsPlayLists(){
        if (mySongsPlayLists == null){
            synchronized (MySongsPlayLists.class){
                if (mySongsPlayLists == null){
                    mySongsPlayLists = new MySongsPlayLists();
                }
            }
        }
        return mySongsPlayLists;
    }
}
