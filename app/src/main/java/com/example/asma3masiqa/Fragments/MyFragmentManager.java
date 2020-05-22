package com.example.asma3masiqa.Fragments;

import android.os.Environment;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;

import java.io.File;

public class MyFragmentManager {

    private static MainActivity mainActivity;
    private SongPlayer songPlayer;
    private SongsList songsList;
    private static MyFragmentManager myFragmentManager;
    private MyFragmentManager(MainActivity mainActivity){
        this.mainActivity = mainActivity;
        this.songPlayer = new SongPlayer();
        this.songsList = new  SongsList();
    }

    public void loadMainFragment(){
        FragmentManager fragmentManager = this.mainActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.playlistfragment,this.songsList);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();
    }

    public void fromSongListToSongPlayer(){
        FragmentManager fragmentManager = this.mainActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.playlistfragment,this.songPlayer);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();
    }

    public void fromSongPlayerToListSong(){
        FragmentManager fragmentManager = mainActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.playlistfragment,this.songPlayer);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();
    }

    public static MyFragmentManager getMyFragmentManager(){
        if (myFragmentManager == null){
            synchronized (MyFragmentManager.class){
                if (myFragmentManager == null){
                    myFragmentManager = new MyFragmentManager(mainActivity);
                }
            }
        }
        return myFragmentManager;
    }

    public void setMainActivity(MainActivity mainActivitys){
        mainActivity = mainActivitys;
    }



}
