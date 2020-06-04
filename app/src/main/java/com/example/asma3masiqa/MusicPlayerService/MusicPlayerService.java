package com.example.asma3masiqa.MusicPlayerService;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;

import static com.example.asma3masiqa.MusicPlayerService.MyNotificationChannel.CHANNEL_ID;

public class MusicPlayerService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,notificationIntent,0);
        Notification myMusicPlayerNotification = new NotificationCompat.Builder(this,CHANNEL_ID)
                .setContentTitle("MyService")
                .setContentText("PLEASE PLAY")
                .setSmallIcon(R.drawable.next_icon)
                .setContentIntent(pendingIntent)
                .build();
        startForeground(1,myMusicPlayerNotification);
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
