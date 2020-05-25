package com.example.asma3masiqa.SongManipulation;

import android.app.Dialog;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.asma3masiqa.Buttons.FactoryButton.ValidButton;
import com.example.asma3masiqa.Files.FileDownload;
import com.example.asma3masiqa.Files.FileE;
import com.example.asma3masiqa.R;
import com.example.asma3masiqa.Threads.DownloadThread;

public class ValiderListner  {

    private Button valid;
    private EditText uri;
    private EditText nameFile;

    public ValiderListner(View view,FileDownload fileDownload,DownloadThread downloadThread,Dialog dialog){
        this.valid = ValidButton.getButton(view);
        this.uri = view.findViewById(R.id.uri);
        this.nameFile = view.findViewById(R.id.filename);
        affectListner(fileDownload,downloadThread,dialog);
    }

    public void affectListner(final FileDownload fileDownload, final DownloadThread downloadThread, final Dialog dialog){
        this.valid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                String path = String.valueOf(uri.getText());
                String extension = path.substring(path.lastIndexOf("."));
                Uri myuri = Uri.parse(path);
                String name = String.valueOf(nameFile.getText())+extension;
                FileE file = new FileE(name,55f,path,myuri);
                downloadThread.assignTask(fileDownload.DownloadFile(file));
            }
        });
    }
}
