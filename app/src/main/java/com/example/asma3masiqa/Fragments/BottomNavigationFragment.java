package com.example.asma3masiqa.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationFragment extends Fragment {
    private BottomNavigationView bottomNavigationView;
    private MainActivity mainActivity;

    public BottomNavigationFragment(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =   inflater.inflate(R.layout.search_fragment,container,false);

        bottomNavigationView = view.findViewById(R.id.bottomNavigiations);
        bottomNavigationView.setSelectedItemId(R.id.albums);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.albums :
                        Toast.makeText(mainActivity,"Albums",Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.playlistSongs  :
                        Toast.makeText(mainActivity,"Songs",Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.searchsong :
                        Toast.makeText(mainActivity,"Search",Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.favsongs:
                        Toast.makeText(mainActivity,"FavSongs",Toast.LENGTH_LONG).show();
                        return true;
                }
                return false;
            };
        });
        return view;

    }
}
