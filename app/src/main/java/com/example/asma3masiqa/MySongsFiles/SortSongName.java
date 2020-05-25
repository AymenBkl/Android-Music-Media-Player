package com.example.asma3masiqa.MySongsFiles;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortSongName extends SortCollections {
    @Override
    public List<File> sortSongs(List<File> songs) {
        Collections.sort(songs, new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return (int) (o1.getName()).compareTo(o2.getName());
            }
        });
        return songs;
    }
}
