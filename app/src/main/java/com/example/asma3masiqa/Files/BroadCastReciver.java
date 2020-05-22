package com.example.asma3masiqa.Files;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.asma3masiqa.MainActivity;

public class BroadCastReciver {

    public static BroadcastReceiver setBroadcatReciverForDownload(final long downloadId, final MainActivity activity,final FileE file){
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                long reference= intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID,-1);
                if (downloadId == reference){
                    Log.i("lol","xdfileDownloaded"+downloadId);
                    SongDownloadHandler songDownloadHandler = new SongDownloadHandler(activity);
                    songDownloadHandler.doOperation();
                }
            }
        };
        return broadcastReceiver;
    }
}
