package com.example.asma3masiqa.Files;

import android.app.DownloadManager;
import android.content.Context;
import android.content.IntentFilter;


import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.Obvserver.Obvserver;
import com.example.asma3masiqa.Obvserver.Subject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileDownload extends FileManager implements Subject {

    private List<Obvserver> obvservers;
    public static FileDownload fileDownload;
    private FileDownload(MainActivity mainActivity){
        super(mainActivity);
        this.obvservers = new ArrayList<Obvserver>();
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

    @Override
    public void registerObvserver(Obvserver obvserver) {
        this.obvservers.add(obvserver);
    }

    @Override
    public void unregisterObvserver(Obvserver obvserver) {
        this.obvservers.remove(obvserver);
    }

    @Override
    public void notifysAll() {
        for(Obvserver obvserver:obvservers){
            obvserver.notifys();
        }
    }

    public static FileDownload getFileDownload(MainActivity mainActivity){
        if (fileDownload == null){
            synchronized (FileDownload.class){
                if (fileDownload == null){
                    fileDownload = new FileDownload(mainActivity);
                }
            }
        }
        return fileDownload;
    }

    public void destroy(){
        fileDownload = null;
        setMainActivity(null);
    }

}
