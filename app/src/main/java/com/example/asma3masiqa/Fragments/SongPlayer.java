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

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;
import com.example.asma3masiqa.R;

public class SongPlayer extends Fragment {
    private View view;
    private MyMediaPlayerSong myMediaPlayerSong;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.song_player,container,false);
        if (myMediaPlayerSong == null) {
            myMediaPlayerSong = new MyMediaPlayerSong(view);
        }
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (myMediaPlayerSong != null ){
            myMediaPlayerSong.playMySong(FragmentCommunication.getFragmentCommunication().getCurrentSong());
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (myMediaPlayerSong != null) {
            myMediaPlayerSong.getMySongsPlayLists().pauseSong();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (myMediaPlayerSong != null){
            myMediaPlayerSong.playMySong(FragmentCommunication.getFragmentCommunication().getCurrentSong());
        }
    }

    @Nullable
    @Override
    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}
