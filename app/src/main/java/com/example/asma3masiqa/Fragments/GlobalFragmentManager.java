package com.example.asma3masiqa.Fragments;

import androidx.fragment.app.FragmentManager;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;

public class GlobalFragmentManager {

    private SongsList songsList;
    private SearchFragment searchFragment;
    private AlbumsFragment albumsFragment;
    private FavoritesFragment favoritesFragment;
    private static GlobalFragmentManager globalFragmentManager;
    private FragmentManager fragmentManager;
    private GlobalFragmentManager(MainActivity mainActivity,SongsList songsList){
        this.songsList = songsList;
        this.searchFragment = new SearchFragment();
        this.albumsFragment = new AlbumsFragment();
        this.favoritesFragment = new FavoritesFragment();
        this.fragmentManager = mainActivity.getSupportFragmentManager();
    }


    public void loadFavoriteFragment(){
        this.fragmentManager.beginTransaction().replace(R.id.playlistfragment,this.favoritesFragment).commit();
    }

    public void loadAlbumsFragment(){
        this.fragmentManager.beginTransaction().replace(R.id.playlistfragment,this.albumsFragment).commit();
    }

    public void loadSearchFragment(){
        this.fragmentManager.beginTransaction().replace(R.id.playlistfragment,this.searchFragment).commit();
    }

    public void loadPlaylistFragment(){
        this.fragmentManager.beginTransaction().replace(R.id.playlistfragment,this.songsList).commit();
    }

    public static GlobalFragmentManager getGlobalFragmentManager(MainActivity mainActivity,SongsList songsList){
        if (globalFragmentManager== null){
            synchronized (GlobalFragmentManager.class){
                if (globalFragmentManager == null){
                    globalFragmentManager = new GlobalFragmentManager(mainActivity,songsList);
                }
            }
        }
        return globalFragmentManager;
    }
}
