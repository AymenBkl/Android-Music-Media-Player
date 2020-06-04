package com.example.asma3masiqa.MusicPlayerService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.asma3masiqa.Files.BroadCastReciver;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;
import com.example.asma3masiqa.MusicPlayerService.OperationsService.NextOperation;

import static com.example.asma3masiqa.MusicPlayerService.MyNotificationChannel.CHANNEL_NAME;

public class MyMusicPlayerBroadCastReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        String action = intent.getStringExtra("Action");
        if (action.equalsIgnoreCase("PlayPause")){
            Log.i("lol","xdcliickedplay");
        }
        else if (action.equalsIgnoreCase("Next")){
            Log.i("lol","xdcliickednext");
            NextOperation.doOperation();
        }
        else if (action.equalsIgnoreCase("Prev")){
            Log.i("lol","xdcliickedprev");

        }
    }

}
