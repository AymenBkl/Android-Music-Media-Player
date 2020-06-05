package com.example.asma3masiqa.Fragments;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.asma3masiqa.Controllers.HolderController;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.Obvserver.Obvserver;
import com.example.asma3masiqa.R;


public class MyFragmentManager implements Obvserver {

    private static MainActivity mainActivity;
    private SongPlayer songPlayer;
    private SongsList songsList;
    private static MyFragmentManager myFragmentManager;
    private HolderController holderController;

    private MyFragmentManager(MainActivity mainActivitys) {
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
        fragmentTransaction.commitNowAllowingStateLoss();

    }

    public void fromSongListToSongPlayer(){
        this.holderController.fragment1ToFragment2();
        this.songPlayer.onResume();
    }

    public void fromSongPlayerToListSong(){
        this.holderController.fragment2toFragment1();
        this.songsList.onResume();
    }
    private void removeFragments(){
        this.holderController.original();
        FragmentManager fragmentManager = this.mainActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.detach(this.songsList);
        fragmentTransaction.attach(this.songsList);
        fragmentTransaction.commit();
   }

   public void detachFragment(){
       FragmentManager fragmentManager = this.mainActivity.getSupportFragmentManager();
       FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
       fragmentTransaction.remove(this.songsList);
       fragmentTransaction.remove(this.songPlayer);
       fragmentTransaction.commitAllowingStateLoss();
       destroy();
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

    public static MainActivity getMainActivity() {
        return mainActivity;
    }
    public void destroy(){
        mainActivity = null;
        myFragmentManager = null;
        songPlayer.onDestroy();
        songsList.onDestroy();
    }
    @Override
    public void notifys() {
        removeFragments();
    }
}
