package com.example.asma3masiqa.Threads;

import android.util.Log;

public class DownloadThread extends MyThread {
    private static DownloadThread downloadThread;
    private DownloadThread(String name){
        super(name);
    }

    public static DownloadThread getMyThread(){
        if (downloadThread == null){
            synchronized (DownloadThread.class){
                if (downloadThread == null){
                    downloadThread = new DownloadThread("My Download Thread");
                }
            }
        }
        return downloadThread;
    }
}
