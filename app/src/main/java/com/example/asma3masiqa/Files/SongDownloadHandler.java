package com.example.asma3masiqa.Files;
import android.widget.Toast;

import com.example.asma3masiqa.MainActivity;


public class SongDownloadHandler extends Handlers {

    public SongDownloadHandler(MainActivity mainActivity) {
        super(mainActivity);
    }

    @Override
    public void doOperation() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getMainActivity().getApplicationContext(),"Your Song Just Downloaded ",Toast.LENGTH_LONG).show();
            }
        };
        getHandler().post(runnable);
    }

}
