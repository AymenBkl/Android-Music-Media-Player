package com.example.asma3masiqa.RecycleView;

import android.content.Context;
import android.os.ConditionVariable;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asma3masiqa.R;

import java.io.File;

public class MyRecycleView {
    private RecyclerView recyclerView;
    private SongsListAdapter songsListAdapter;

    public MyRecycleView(){
        this.songsListAdapter = new SongsListAdapter();
    }
    public void setRecyclerView(View view,Context context){
        this.recyclerView = (RecyclerView ) view.findViewById(R.id.myrecyle);
        this.recyclerView.setAdapter(songsListAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context);
        this.recyclerView.setLayoutManager(layoutManager);
    }



}
