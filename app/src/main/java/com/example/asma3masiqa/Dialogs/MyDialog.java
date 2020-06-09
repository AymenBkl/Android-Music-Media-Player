package com.example.asma3masiqa.Dialogs;

import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.widget.Toast;

import com.example.asma3masiqa.Files.FileDownload;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.Threads.DownloadThread;


public abstract class MyDialog {
    private Context context;


    public abstract Dialog getMyDialog(MainActivity mainActivity, FileDownload fileDownload, DownloadThread downloadThread);

}
