package com.example.asma3masiqa.RecycleView.FavoriteFragmentRecycleView;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asma3masiqa.R;
import com.example.asma3masiqa.RecycleView.SongsListAdapter;

public class FavoriteFragmentRecycleView {
    private RecyclerView recyclerView;
    private FavoriteSongAdapter favoriteSongAdapter;

    public FavoriteFragmentRecycleView(){
        this.favoriteSongAdapter = new FavoriteSongAdapter();
    }
    public void setRecyclerView(View view, Context context){
        this.recyclerView = (RecyclerView ) view.findViewById(R.id.myrecyle);
        this.recyclerView.setAdapter(this.favoriteSongAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        this.recyclerView.setLayoutManager(layoutManager);
    }
}
