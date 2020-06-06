package com.example.asma3masiqa.BottomNavigationMenu;

import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.asma3masiqa.Fragments.AlbumsFragment;
import com.example.asma3masiqa.Fragments.FavoritesFragment;
import com.example.asma3masiqa.Fragments.SearchFragment;
import com.example.asma3masiqa.Fragments.SongsList;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyBottomNavigationView {

    private BottomNavigationView myBottomNavigationView;
    private SongsList songsList;
    private SearchFragment searchFragment;
    private AlbumsFragment albumsFragment;
    private FavoritesFragment favoritesFragment;
    public MyBottomNavigationView(MainActivity mainActivity, SongsList songsList){
        this.songsList = songsList;
        this.searchFragment = new SearchFragment();
        this.albumsFragment = new AlbumsFragment();
        this.favoritesFragment = new FavoritesFragment();
        this.myBottomNavigationView =  mainActivity.findViewById(R.id.bottomNavigiations);
        setMyBottomNavigationView(mainActivity.getSupportFragmentManager());
    }

    private void setMyBottomNavigationView(final FragmentManager fragmentManager){
        this.myBottomNavigationView.setSelectedItemId(R.id.playlistSongs);
        this.myBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.albums :
                        fragmentManager.beginTransaction().replace(R.id.playlistfragment,albumsFragment).commit();
                        break;
                    case R.id.playlistSongs  :
                        fragmentManager.beginTransaction().replace(R.id.playlistfragment,songsList).commit();
                        break;
                    case R.id.searchsong :
                        fragmentManager.beginTransaction().replace(R.id.playlistfragment,searchFragment).commit();
                        break;
                    case R.id.favsongs:
                        fragmentManager.beginTransaction().replace(R.id.playlistfragment,favoritesFragment).commit();
                        break;
                }
                return true;
            };
        });
    }
}
