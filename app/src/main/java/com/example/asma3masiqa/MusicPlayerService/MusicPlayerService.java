package com.example.asma3masiqa.MusicPlayerService;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;
import com.example.asma3masiqa.R;

import static android.app.PendingIntent.FLAG_UPDATE_CURRENT;
import static com.example.asma3masiqa.MusicPlayerService.MyNotificationChannel.CHANNEL_ID;
import static com.example.asma3masiqa.MusicPlayerService.MyNotificationChannel.CHANNEL_NAME;

public class MusicPlayerService extends Service {

    private MyMusicPlayerBroadCastReciever myMusicPlayerBroadCastReciever;
    @Override
    public void onCreate() {
        myMusicPlayerBroadCastReciever = new MyMusicPlayerBroadCastReciever();
        registerReceiver(myMusicPlayerBroadCastReciever,new IntentFilter(CHANNEL_NAME));
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent1 = PendingIntent.getBroadcast(this,0,new Intent(CHANNEL_NAME),PendingIntent.FLAG_UPDATE_CURRENT);
        Notification myMusicPlayerNotification = new NotificationCompat.Builder(this,CHANNEL_ID)
                .setContentTitle("MyService")
                .setContentText("PLEASE PLAY")
                .setSmallIcon(R.drawable.next_icon)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_STATUS)
                .addAction(R.drawable.play_icon,CHANNEL_NAME,pendingIntent1)
                .build();
        startForeground(1,myMusicPlayerNotification);
        MySongsPlayLists.getMySongsPlayLists().resumeSong();
        return START_NOT_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
