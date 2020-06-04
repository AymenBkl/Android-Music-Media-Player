package com.example.asma3masiqa.MusicPlayerService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.asma3masiqa.Files.BroadCastReciver;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

import static com.example.asma3masiqa.MusicPlayerService.MyNotificationChannel.CHANNEL_NAME;

public class MyMusicPlayerBroadCastReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        String action = intent.getAction();
        if (action.equalsIgnoreCase(CHANNEL_NAME)){
            Log.i("lol","xdcliicked");
        }
    }

}
