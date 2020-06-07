package com.example.asma3masiqa.MySongsFiles;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlbumsCategory {

    public Map<String,List<File>> checks(Map<String, List<File>> mysongs, File song, String album){
        if (album == null){
            album = "Unknown";
        }
        if (mysongs.containsKey(album)){
            mysongs.get(album).add(song);
        }
        else {
            List<File> tempsong = new ArrayList<File>();
            tempsong.add(song);
            mysongs.put(album,tempsong);
        }
        return mysongs;
    }
}
