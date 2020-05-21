package com.example.asma3masiqa.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.asma3masiqa.R;
import com.example.asma3masiqa.RecycleView.MyRecycleView;

import java.io.File;

public class SongsList extends Fragment {
    private MyRecycleView myRecycleView;
    public SongsList(File[] files){
        this.myRecycleView = new MyRecycleView(files);
        Log.i("lol","xddonefragment");
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.mylist,container,false);
        this.myRecycleView.setRecyclerView(view,getActivity());
        Log.i("lol","xdrecycle");

        return view;
    }
}
