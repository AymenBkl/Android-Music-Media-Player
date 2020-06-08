package com.example.asma3masiqa.MySongsFiles;

import android.media.MediaMetadataRetriever;
import android.os.Environment;
import android.util.Log;

import com.example.asma3masiqa.Database.Controllers.FavSongController;
import com.example.asma3masiqa.Database.MySongsDataBase;
import com.example.asma3masiqa.Fragments.AlbumsFragment;
import com.example.asma3masiqa.Obvserver.Obvserver;
import com.example.asma3masiqa.RecycleView.AlbumsRecycleView.CurrentAlbum;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySongsCollections  {
    private Map<String,List<File>> mysongs;
    private MediaMetadataRetriever mediaMetadataRetriever;
    private AlbumsCategory albumsCategory;

    public MySongsCollections(){
        this.mediaMetadataRetriever = new MediaMetadataRetriever();
        this.albumsCategory = new AlbumsCategory();
        initiateSongs();
    }
    private void getAllMyFile(File file){
       File[] tempsongs = file.listFiles();
       for(File tempsong : tempsongs){
           if (tempsong.isDirectory()){
               getAllMyFile(tempsong);
           }
           else {

               if (tempsong.getName().endsWith(".mp3") || tempsong.getName().endsWith(".mp4") && !tempsong.isHidden()) {
                   this.mediaMetadataRetriever.setDataSource(tempsong.getAbsolutePath());
                   String album = this.mediaMetadataRetriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_ALBUM);
                   this.mysongs.get("All Music").add(tempsong);
                   this.mysongs = this.albumsCategory.checks(mysongs,tempsong,album);
               }
           }
       }

    }
    private void initiateSongs(){
        this.mysongs = new HashMap<String,List<File>>();
        this.mysongs.put("All Music",new ArrayList<File>());
        getAllMyFile(new File(Environment.getExternalStorageDirectory()+""));
    }
    public List<File> getMysongs() {
        if (!CurrentAlbum.getCurrentAlbum().equalsIgnoreCase("Favorites")) {
            CurrentAlbum.setAlbums(this.mysongs.keySet().toArray(new String[0]));
            return this.mysongs.get(CurrentAlbum.getCurrentAlbum());
        } else {
            FavSongController favSongController = new FavSongController(MySongsDataBase.getMySongsDataBase(null));
            return favSongController.getFavSongs();
        }
    }

    public void setMysongs(List<File> mysongs) {
        this.mysongs.put("Unknown",mysongs);
    }


}
