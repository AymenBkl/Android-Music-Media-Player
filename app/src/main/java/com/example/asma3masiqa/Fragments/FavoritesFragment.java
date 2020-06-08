package com.example.asma3masiqa.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.asma3masiqa.R;
import com.example.asma3masiqa.RecycleView.FavoriteFragmentRecycleView.FavoriteFragmentRecycleView;

public class FavoritesFragment extends Fragment {
    private FavoriteFragmentRecycleView favoriteFragmentRecycleView;
    public FavoritesFragment(){
        this.favoriteFragmentRecycleView = new FavoriteFragmentRecycleView();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.favorites_layout,container,false);
        this.favoriteFragmentRecycleView.setRecyclerView(view,getActivity());
        return view;
    }
}
