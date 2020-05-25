package com.example.asma3masiqa.MySongsFiles;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortSongDate extends SortCollections{


    @Override
    public List<File> sortSongs(List<File> songs) {
        Collections.sort(songs, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return (int) ((o1.lastModified()>o2.lastModified()) ? o1.lastModified():o2.lastModified());
            }
        });
        return songs;
    }
}
