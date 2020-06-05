package com.example.asma3masiqa.MusicPlayerService.OperationsService;

import android.util.Log;

import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;
import com.example.asma3masiqa.MusicPlayerService.MyNotification;

public class PrevouisOperation {

    public static void doOperation(){
        int position = FragmentCommunication.getFragmentCommunication().getCurrentSong()-1;
        FragmentCommunication.getFragmentCommunication().setCurrentSong(position);
        position = FragmentCommunication.getFragmentCommunication().getCurrentSong();
        MySongsPlayLists.getMySongsPlayLists().playSongForService(position);
        String title = MySongsPlayLists.getMySongsPlayLists().songs.get(position).getName();
        MyNotification.changeText(title);
    }
}
