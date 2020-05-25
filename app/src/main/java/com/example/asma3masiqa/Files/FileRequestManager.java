package com.example.asma3masiqa.Files;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;

public class FileRequestManager {

    public static DownloadManager.Request buildRequest(Uri uri, String name){
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setTitle("My Songs")
                .setDescription("Downloading")
                .setDestinationInExternalPublicDir(Environment.DIRECTORY_MUSIC,name)
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Log.i("lol","xd"+uri);
        return request;
    }
}
