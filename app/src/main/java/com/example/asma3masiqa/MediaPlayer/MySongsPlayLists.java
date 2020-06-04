package com.example.asma3masiqa.MediaPlayer;


import android.os.Environment;
import android.os.HandlerThread;
import android.util.Log;
import android.widget.SeekBar;

import com.example.asma3masiqa.Files.FileDownload;
import com.example.asma3masiqa.Files.FileE;
import com.example.asma3masiqa.MyDrawerLayout.SortOption;
import com.example.asma3masiqa.MySongsFiles.MySongsCollections;
import com.example.asma3masiqa.MySongsFiles.MySortAdapter;
import com.example.asma3masiqa.Obvserver.Obvserver;
import com.example.asma3masiqa.Threads.MyMedeaPlayerThread;
import com.example.asma3masiqa.Threads.ThreadDestroyer;
import com.example.asma3masiqa.Threads.ThreadInializare;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MySongsPlayLists implements Obvserver {

    private MyMediaPlayerAdapter myMediaPlayerAdapter;
    public List<File> songs;
    private MyMedeaPlayerThread myMedeaPlayerThread;
    private static MySongsPlayLists mySongsPlayLists;
    private MySortAdapter mySortAdapter;

    private MySongsPlayLists(){
        this.myMediaPlayerAdapter = new MyMediaPlayerAdapter();
        this.mySortAdapter = new MySortAdapter();
        this.songs = mySortAdapter.getMySongs(SortOption.getSortOption().getSortoption());
        myMedeaPlayerThread = (MyMedeaPlayerThread) ThreadInializare.inizialize(new MyMedeaPlayerThread("MedeaPlayerThread"));
        FileDownload.getFileDownload(null).registerObvserver(this);


    }

    public void playSong(final int position, final MyMediaPlayerSong myMediaPlayerSong){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    myMediaPlayerAdapter.prepareSong(songs.get(position).getAbsolutePath());
                    myMediaPlayerAdapter.play();
                    myMediaPlayerSong.seekBarManipulaition();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
         myMedeaPlayerThread.assignTask(runnable);

    }
    public void playSongForService(final int position){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    myMediaPlayerAdapter.prepareSong(songs.get(position).getAbsolutePath());
                    myMediaPlayerAdapter.play();
                }
                catch (Exception e){
                    e.printStackTrace();
                }
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
        return this.songs.size();
    }

    public static void setMySongsPlayLists(MySongsPlayLists mySongsPlayLists) {
        MySongsPlayLists.mySongsPlayLists = mySongsPlayLists;
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

    @Override
    public void notifys() {
        this.songs = mySortAdapter.getMySongs(SortOption.getSortOption().getSortoption());

    }

    public void destroy(){
        ThreadDestroyer.destroy(this.myMedeaPlayerThread);
        mySongsPlayLists = null;
    }
}
