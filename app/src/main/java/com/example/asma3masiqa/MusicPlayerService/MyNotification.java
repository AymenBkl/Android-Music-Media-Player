package com.example.asma3masiqa.MusicPlayerService;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v4.media.session.MediaSessionCompat;

import androidx.core.app.NotificationCompat;

import com.example.asma3masiqa.MusicPlayerService.MyIntentets.NextIntent;
import com.example.asma3masiqa.MusicPlayerService.MyIntentets.PlayPauseIntent;
import com.example.asma3masiqa.MusicPlayerService.MyIntentets.PreviousIntent;
import com.example.asma3masiqa.R;

import static com.example.asma3masiqa.MusicPlayerService.MyNotificationChannel.CHANNEL_ID;

public class MyNotification {


    public static Notification buildNotification(Context context){
        Bitmap icon = BitmapFactory.decodeResource(context.getResources(),R.drawable.mysongplayerbackground);
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context,"tag");
        Notification myMusicPlayerNotification = new NotificationCompat.Builder(context,CHANNEL_ID)
                .setContentTitle("MasiqaPlayer")
                .setContentText("Playing Now Test")
                .setSmallIcon(R.drawable.song)
                .setLargeIcon(icon)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_SERVICE)
                .setColor(Color.CYAN)
                .setShowWhen(false)
                .setOnlyAlertOnce(true)
                .addAction(R.drawable.prevouis_icon,"Prevouis", PreviousIntent.buildIntent(context))
                .addAction(R.drawable.play_icon,"Play", PlayPauseIntent.buildIntent(context))
                .addAction(R.drawable.next_icon,"Next", NextIntent.buildIntent(context))
                .setStyle(new androidx.media.app.NotificationCompat.MediaStyle()
                    .setShowActionsInCompactView(0,1,2)
                    .setMediaSession(mediaSessionCompat.getSessionToken())
                    )

                .build();
        return myMusicPlayerNotification;
    }
}
