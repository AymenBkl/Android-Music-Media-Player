package com.example.asma3masiqa.Fragments;

import android.content.Context;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.asma3masiqa.Buttons.FactoryButton.FavoriteButtonFactory;
import com.example.asma3masiqa.R;
import com.example.asma3masiqa.RecycleView.MyRecycleView;

import java.io.File;

public class SongsList extends Fragment {
    private MyRecycleView myRecycleView;
    public SongsList(){
        this.myRecycleView = new MyRecycleView();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.mylist,container,false);
        FavoriteButtonFactory.setId(0);
        this.myRecycleView.setRecyclerView(view,getActivity());
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() { super.onDestroy();
    }
}
