package com.example.asma3masiqa.RecycleView.SearchManager;

import android.content.Context;
import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asma3masiqa.R;
import com.example.asma3masiqa.RecycleView.SongsListAdapter;

public class SearchRecycleView {
    private RecyclerView recyclerView;
    private SearchSongsAdapter songsListAdapter;

    public SearchRecycleView(SearchCollection searchCollection){
        this.songsListAdapter = new SearchSongsAdapter(searchCollection);
    }
    public void setRecyclerView(View view, Context context){
        this.recyclerView = (RecyclerView) view.findViewById(R.id.myrecyle);
        this.recyclerView.setAdapter(songsListAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        this.recyclerView.setLayoutManager(layoutManager);
    }
    public void update(){
        this.songsListAdapter.notifyDataSetChanged();
    }
}
