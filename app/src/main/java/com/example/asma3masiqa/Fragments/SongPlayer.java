package com.example.asma3masiqa.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;
import com.example.asma3masiqa.R;

public class SongPlayer extends Fragment {

    public SongPlayer(){
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.song_player,container,false);
        MyMediaPlayerSong myMediaPlayerSong = new MyMediaPlayerSong(view);
        myMediaPlayerSong.playMySong(14);
        return view;
    }
}
