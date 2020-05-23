package com.example.asma3masiqa.Fragments;

import android.os.Environment;
import android.util.Log;
import android.widget.LinearLayout;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.asma3masiqa.Controllers.BasicHolderControler;
import com.example.asma3masiqa.Controllers.HolderController;
import com.example.asma3masiqa.Controllers.HolderFragment1Controler;
import com.example.asma3masiqa.Controllers.HolderFragment2Controller;
import com.example.asma3masiqa.Controllers.InterctionHolderController;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;

import java.io.File;

public class MyFragmentManager {

    private static MainActivity mainActivity;
    private SongPlayer songPlayer;
    private SongsList songsList;
    private static MyFragmentManager myFragmentManager;
    private HolderController holderController;

    private MyFragmentManager(MainActivity mainActivitys){
        mainActivity = mainActivitys;
        this.songPlayer = new SongPlayer();
        this.songsList = new  SongsList();
        this.holderController = new HolderController(mainActivity);

    }

    public void loadMainFragment(){
        FragmentManager fragmentManager = this.mainActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.playlistfragment,this.songsList);
        fragmentTransaction.add(R.id.playfragment,this.songPlayer);
        fragmentTransaction.commit();

    }

    public void fromSongListToSongPlayer(){
        this.holderController.fragment1ToFragment2();
        this.songPlayer.onResume();
    }

    public void fromSongPlayerToListSong(){
        this.holderController.fragment2toFragment1();
        this.basicHolderControler.changeWeight();
        this.basicHolderControler.toGone();
        this.interctionHolderController.changeWeight();
        this.songsList.onResume();
    }

    public static MyFragmentManager getMyFragmentManager(MainActivity mainActivity){
        if (myFragmentManager == null){
            synchronized (MyFragmentManager.class){
                if (myFragmentManager == null){
                    myFragmentManager = new MyFragmentManager(mainActivity);
                }
            }
        }
        return myFragmentManager;
    }

    public static void setMainActivity(MainActivity mainActivitys){
        mainActivity = mainActivitys;
    }



}
