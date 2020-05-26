package com.example.asma3masiqa.Dialogs;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;

import com.example.asma3masiqa.Files.FileDownload;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;
import com.example.asma3masiqa.SongManipulation.CancelListner;
import com.example.asma3masiqa.SongManipulation.ValiderListner;
import com.example.asma3masiqa.Threads.DownloadThread;

public class DownloadDialog extends MyDialog {
    @Override
    public Dialog getMyDialog(MainActivity mainActivity, FileDownload fileDownload, DownloadThread downloadThread) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.dialogdownload, null);
        Dialog dialog = new Dialog(mainActivity);
        dialog.setContentView(view);
        dialog.setTitle("Downloading Song");
        new ValiderListner(view,fileDownload,downloadThread,dialog);
        new CancelListner(view,dialog);
        return dialog;
    }
}
