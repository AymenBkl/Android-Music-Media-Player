package com.example.asma3masiqa.MusicPlayerService.OperationsService;

import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public class PauseOperation {

    public static void doOperation(){
        if (FragmentCommunication.getFragmentCommunication().isPlay()){
            MySongsPlayLists.getMySongsPlayLists().pauseSong();
            FragmentCommunication.getFragmentCommunication().setPlay(false);
        }
    }
}
