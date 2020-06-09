package com.example.asma3masiqa.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.asma3masiqa.R;
import com.example.asma3masiqa.RecycleView.AlbumsRecycleView.AlbumsRecycleView;

public class AlbumsFragment extends Fragment {
    private AlbumsRecycleView albumsRecycleView;

    public AlbumsFragment(){
        this.albumsRecycleView = new AlbumsRecycleView();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.albums_layout,container,false);
        this.albumsRecycleView.setRecyclerView(view,getActivity());
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
