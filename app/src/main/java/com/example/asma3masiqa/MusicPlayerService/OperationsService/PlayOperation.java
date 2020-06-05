package com.example.asma3masiqa.MusicPlayerService.OperationsService;


import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public class PlayOperation extends Operation {

    public static void doOperation(){
        if (!FragmentCommunication.getFragmentCommunication().isPlay()){
            MySongsPlayLists.getMySongsPlayLists().resumeSong();
            FragmentCommunication.getFragmentCommunication().setPlay(true);
        }
    }
}
