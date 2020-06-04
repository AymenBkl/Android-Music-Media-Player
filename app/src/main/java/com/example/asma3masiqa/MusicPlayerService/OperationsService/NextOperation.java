package com.example.asma3masiqa.MusicPlayerService.OperationsService;

import android.util.Log;

import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public class NextOperation {

    public static void doOperation(){
        int position = FragmentCommunication.getFragmentCommunication().getCurrentSong()+1;
        MySongsPlayLists.getMySongsPlayLists().playSongForService(position);
        String title = MySongsPlayLists.getMySongsPlayLists().songs.get(position).getName();
        Log.i("lol","xd"+title);
        FragmentCommunication.getFragmentCommunication().setCurrentSong(position);

    }
}
