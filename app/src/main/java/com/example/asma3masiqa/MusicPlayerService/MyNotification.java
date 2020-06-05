package com.example.asma3masiqa.MusicPlayerService;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;

import com.example.asma3masiqa.Fragments.FragmentCommunication;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;
import com.example.asma3masiqa.MusicPlayerService.MyIntentets.NextIntent;
import com.example.asma3masiqa.MusicPlayerService.MyIntentets.PlayPauseIntent;
import com.example.asma3masiqa.MusicPlayerService.MyIntentets.PreviousIntent;
import com.example.asma3masiqa.R;

import static com.example.asma3masiqa.MusicPlayerService.MyNotificationChannel.CHANNEL_ID;

public class MyNotification {

    private static NotificationCompat.Builder myMusicPlayerNotification;
    private String content;
    private static NotificationManager notificationManager;
    public MyNotification(MusicPlayerService musicPlayerService){
        this.content = "Playin Now ";
        notificationManager = (NotificationManager) musicPlayerService.getSystemService(Context.NOTIFICATION_SERVICE);
    }
    public Notification buildNotification(Context context){
        Bitmap icon = BitmapFactory.decodeResource(context.getResources(),R.drawable.song);
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context,"tag");
        this.myMusicPlayerNotification = new NotificationCompat.Builder(context,CHANNEL_ID)
                .setContentTitle("Masiqa Player")
                .setContentText(content + MySongsPlayLists.getMySongsPlayLists().songs.get(FragmentCommunication.getFragmentCommunication().getCurrentSong()).getName())
                .setAutoCancel(true)
                .setSmallIcon(R.drawable.song)
                .setLargeIcon(icon)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_SERVICE)
                .setColor(Color.CYAN)
                .setShowWhen(false)
                .setOnlyAlertOnce(true)
                .setOngoing(true)
                .addAction(R.drawable.prevouis_icon,"Prevouis", PreviousIntent.buildIntent(context))
                .addAction(R.drawable.play_icon,"Play", PlayPauseIntent.buildIntent(context))
                .addAction(R.drawable.next_icon,"Next", NextIntent.buildIntent(context))
                .setStyle(new androidx.media.app.NotificationCompat.MediaStyle()
                    .setShowActionsInCompactView(0,1,2)
                    .setMediaSession(mediaSessionCompat.getSessionToken())
                    )
                ;
        return myMusicPlayerNotification.build();
    }

    public static void changeText(String title){
        myMusicPlayerNotification.setContentText("Playing now" + MySongsPlayLists.getMySongsPlayLists().songs.get(FragmentCommunication.getFragmentCommunication().getCurrentSong()).getName());
        notificationManager.notify(1,myMusicPlayerNotification.build());
        Log.i("lol","xd"+title);
    }

}
