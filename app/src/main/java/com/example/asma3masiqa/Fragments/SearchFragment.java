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

public class SearchFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =   inflater.inflate(R.layout.search_fragment,container,false);

        return view;

    }
}