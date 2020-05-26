package com.example.asma3masiqa.Dialogs;

import android.app.Dialog;
import android.util.Log;
import android.view.LayoutInflater;

import com.example.asma3masiqa.Files.FileDownload;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;
import com.example.asma3masiqa.SongManipulation.ValiderListner;
import com.example.asma3masiqa.Threads.DownloadThread;
import com.example.asma3masiqa.Threads.ThreadInializare;

public class DownloadFromDialog extends DialogManager {

    private Dialog downloadDialog;
    private DownloadThread downloadThread;
    private FileDownload fileDownload;

    public DownloadFromDialog(MainActivity mainActivity){
        this.downloadThread = (DownloadThread) ThreadInializare.inizialize(new DownloadThread("My Download Thread"));
        this.fileDownload = FileDownload.getFileDownload(mainActivity);
        this.downloadDialog = new DownloadDialog().getMyDialog(mainActivity,this.fileDownload,this.downloadThread);

    }
    @Override
    public void doOperation() {
            downloadDialog.show();
    }

}
