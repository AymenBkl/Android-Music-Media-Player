package com.example.asma3masiqa.MusicPlayerService;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;
import com.example.asma3masiqa.R;

import static android.app.PendingIntent.FLAG_UPDATE_CURRENT;
import static com.example.asma3masiqa.MusicPlayerService.MyNotificationChannel.CHANNEL_ID;
import static com.example.asma3masiqa.MusicPlayerService.MyNotificationChannel.CHANNEL_NAME;

public class MusicPlayerService extends Service {
    private MyNotification myNotification;
    @Override
    public void onCreate() {
        super.onCreate();
        this.myNotification = new MyNotification(this);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        startForeground(1,this.myNotification.buildNotification(this));
        MySongsPlayLists.getMySongsPlayLists().resumeSong();
        return START_NOT_STICKY;
    }
    @Override
    public void onDestroy() {
        Log.i("lol","xdDestroyed Service");
        super.onDestroy();
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
