package com.example.asma3masiqa.MusicPlayerService.MyIntentets;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import com.example.asma3masiqa.MusicPlayerService.MyMusicPlayerBroadCastReciever;

public class PlayPauseIntent extends MyIntents {


    public static PendingIntent buildIntent(Context context){
        Intent myIntent = new Intent(context, MyMusicPlayerBroadCastReciever.class);
        myIntent.putExtra("Action","PlayPause");
        PendingIntent actionIntent = PendingIntent.getBroadcast(context,
                1,
                myIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        return actionIntent;
    }
}