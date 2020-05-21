package com.example.asma3masiqa.Files;
import android.os.Environment;
import android.widget.Toast;

import com.example.asma3masiqa.MainActivity;


public class SongDownloadHandler extends Handlers {

    public SongDownloadHandler(MainActivity mainActivity) {
        super(mainActivity);
    }

    @Override
    public void doOperation(final FileE file) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                file.setLocation(changeLocation(file.getName()));
                Toast.makeText(getMainActivity().getApplicationContext(),"Your Song Just Downloaded "+ file.getName(),Toast.LENGTH_LONG).show();
            }
        };
        getHandler().post(runnable);
    }
    public String changeLocation(String name){
        return Environment.getExternalStorageDirectory()+"/Music/"+ name;
    }
}
