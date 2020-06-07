package com.example.asma3masiqa.MediaStore;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;

import java.util.ArrayList;

public class MediaStoreAlbums {


    public static ArrayList<CommonModel> getAllMusicPathList(Context context) {
        ArrayList<CommonModel> musicPathArrList = new ArrayList<>();
        Uri songUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;

        Cursor cursorAudio = context.getContentResolver().query(songUri, null, null, null, null);
        if (cursorAudio != null && cursorAudio.moveToFirst()) {

            Cursor cursorAlbum;
            if (cursorAudio != null && cursorAudio.moveToFirst()) {

                do {
                    Long albumId = Long.valueOf(cursorAudio.getString(cursorAudio.getColumnIndex(MediaStore.Audio.Media.ALBUM_ID)));
                    cursorAlbum = context.getContentResolver().query(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI,
                            new String[]{MediaStore.Audio.Albums._ID, MediaStore.Audio.Albums.ALBUM,MediaStore.Audio.Media.IS_MUSIC},
                            MediaStore.Audio.Albums._ID + "=" + albumId, null, null);

                    if(cursorAlbum != null && cursorAlbum.moveToFirst()){
                        String albumCoverPath = cursorAlbum.getString(cursorAlbum.getColumnIndex(MediaStore.Audio.Albums.ALBUM));
                        String data = cursorAudio.getString(cursorAudio.getColumnIndex(MediaStore.Audio.Media.DATA));
                        musicPathArrList.add(new CommonModel(data,albumCoverPath ,false));
                    }

                } while (cursorAudio.moveToNext());
            }
        }
        for(CommonModel commonModel : musicPathArrList){
            Log.i("lol","xd"+commonModel.getAlbumCoverPath());
        }
        return musicPathArrList;

    }
}
