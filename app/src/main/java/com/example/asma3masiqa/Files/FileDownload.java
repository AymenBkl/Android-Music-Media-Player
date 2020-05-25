package com.example.asma3masiqa.Files;

import android.app.DownloadManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.ConditionVariable;
import android.util.Log;

import com.example.asma3masiqa.MainActivity;

public class FileDownload extends FileManager {

    public FileDownload(MainActivity mainActivity){
        super(mainActivity);
    }

    public Runnable DownloadFile(final FileE file){
        return runnable = new Runnable() {
            @Override
            public void run() {
                DownloadManager downloadManager = (DownloadManager) getContext().getSystemService(Context.DOWNLOAD_SERVICE);

                final long downloadId = downloadManager.enqueue(FileRequestManager.buildRequest(file.getUri(),file.getName()));

                IntentFilter intentFilter = new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE);

                getContext().registerReceiver(BroadCastReciver.setBroadcatReciverForDownload(downloadId,getMainActivity(),file),intentFilter);
            }
        };
    }
}
