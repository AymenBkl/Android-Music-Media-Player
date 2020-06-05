package com.example.asma3masiqa.MusicPlayerService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.asma3masiqa.Files.BroadCastReciver;
import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;
import com.example.asma3masiqa.MusicPlayerService.OperationsService.NextOperation;
import com.example.asma3masiqa.MusicPlayerService.OperationsService.PauseOperation;
import com.example.asma3masiqa.MusicPlayerService.OperationsService.PlayOperation;
import com.example.asma3masiqa.MusicPlayerService.OperationsService.PrevouisOperation;

import static com.example.asma3masiqa.MusicPlayerService.MyNotificationChannel.CHANNEL_NAME;

public class MyMusicPlayerBroadCastReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        String action = intent.getStringExtra("Action");
        if (action.equalsIgnoreCase("PlayPause")){
            if (FragmentCommunication.getFragmentCommunication().isPlay()){
                PauseOperation.doOperation();
            }
            else {
                PlayOperation.doOperation();
            }
        }
        else if (action.equalsIgnoreCase("Next")){
            NextOperation.doOperation();
        }
        else if (action.equalsIgnoreCase("Prev")){
            PrevouisOperation.doOperation();
        }
    }

}
