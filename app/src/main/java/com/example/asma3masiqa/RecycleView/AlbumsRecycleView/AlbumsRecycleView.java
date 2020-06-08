package com.example.asma3masiqa.RecycleView.AlbumsRecycleView;

import android.content.Context;
import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asma3masiqa.R;

public class AlbumsRecycleView {


    private RecyclerView recyclerView;
    private AlbumsRecycleAdapter albumsRecycleAdapter;

    public AlbumsRecycleView(){
        this.albumsRecycleAdapter = new AlbumsRecycleAdapter();
    }
    public void setRecyclerView(View view, Context context){
        this.recyclerView = (RecyclerView ) view.findViewById(R.id.albumsList);
        this.recyclerView.setAdapter(this.albumsRecycleAdapter);
        this.recyclerView.setLayoutManager(new GridLayoutManager(context,2));
    }
}
