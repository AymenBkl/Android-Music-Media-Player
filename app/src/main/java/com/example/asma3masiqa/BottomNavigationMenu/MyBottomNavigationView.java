package com.example.asma3masiqa.BottomNavigationMenu;

import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.asma3masiqa.Fragments.AlbumsFragment;
import com.example.asma3masiqa.Fragments.FavoritesFragment;
import com.example.asma3masiqa.Fragments.GlobalFragmentManager;
import com.example.asma3masiqa.Fragments.SearchFragment;
import com.example.asma3masiqa.Fragments.SongsList;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MyBottomNavigationView {

    private BottomNavigationView myBottomNavigationView;
    private GlobalFragmentManager globalFragmentManager;
    public MyBottomNavigationView(MainActivity mainActivity, SongsList songsList){
        this.globalFragmentManager = GlobalFragmentManager.getGlobalFragmentManager(mainActivity,songsList);
        this.myBottomNavigationView =  mainActivity.findViewById(R.id.bottomNavigiations);
        setMyBottomNavigationView();
    }

    private void setMyBottomNavigationView(){
        this.myBottomNavigationView.setSelectedItemId(R.id.playlistSongs);
        this.myBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.albums :
                        globalFragmentManager.loadAlbumsFragment();
                        break;
                    case R.id.playlistSongs  :
                        globalFragmentManager.loadPlaylistFragment();
                        break;
                    case R.id.searchsong :
                        globalFragmentManager.loadSearchFragment();
                        break;
                    case R.id.favsongs:
                        globalFragmentManager.loadFavoriteFragment();
                        break;
                }
                return true;
            };
        });
    }
}
