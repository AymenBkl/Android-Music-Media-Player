package com.example.asma3masiqa.MyDrawerLayout;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;
import com.example.asma3masiqa.Obvserver.Obvserver;
import com.example.asma3masiqa.Obvserver.Subject;
import com.example.asma3masiqa.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MyNavigationView  implements Subject {

    private NavigationView navigationView;
    private List<Obvserver> obvservers;

    public MyNavigationView(MainActivity mainActivity){

        this.navigationView = (NavigationView) mainActivity.findViewById(R.id.songOptionsView);
        this.obvservers = new ArrayList<Obvserver>();
        this.obvservers.add(MyFragmentManager.getMyFragmentManager(mainActivity));
        this.obvservers.add(MySongsPlayLists.getMySongsPlayLists());
    }

    public void setItemClick(){
        this.navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.byDefault:
                        SortOption.getSortOption().setSortoption("none");
                        notifysAll();
                    case R.id.byName :
                        SortOption.getSortOption().setSortoption("name");
                        notifysAll();
                        return true;
                    case R.id.byDate :
                        SortOption.getSortOption().setSortoption("date");
                        notifysAll();
                        return true;
                    case R.id.bySize:
                        SortOption.getSortOption().setSortoption("size");
                        notifysAll();
                        return true;
                }
                return true;
            }
            });
        };

    @Override
    public void registerObvserver(Obvserver obvserver) {
        this.obvservers.add(obvserver);
    }

    @Override
    public void unregisterObvserver(Obvserver obvserver) {
        this.obvservers.remove(obvserver);
    }

    @Override
    public void notifysAll() {
        for(Obvserver obvserver : obvservers){
            obvserver.notifys();
        }
    }


}

