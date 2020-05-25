package com.example.asma3masiqa.MySongsFiles;

import android.os.Environment;

import com.example.asma3masiqa.Obvserver.Obvserver;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MySongsCollections  {
    private List<File> mysongs;
    public MySongsCollections(){
    }
    private void getAllMyFile(File file){
       File[] tempsongs = file.listFiles();

       for(File tempsong : tempsongs){
           if (tempsong.isDirectory()){
               getAllMyFile(tempsong);
           }
           else {

               if (tempsong.getName().endsWith(".mp3") || tempsong.getName().endsWith(".mp4") && !tempsong.isHidden()) {
                   this.mysongs.add(tempsong);
               }
           }
       }

    }
    private void initiateSongs(){
        this.mysongs = new ArrayList<File>();
        getAllMyFile(new File(Environment.getExternalStorageDirectory()+""));
    }
    public List<File> getMysongs() {
        initiateSongs();
        return mysongs;
    }

    public void setMysongs(List<File> mysongs) {
        this.mysongs = mysongs;
    }


}
