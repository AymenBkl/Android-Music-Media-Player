package com.example.asma3masiqa.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.asma3masiqa.Database.DOA.SongFavRepository;
import com.example.asma3masiqa.Database.Entities.FavSongs;

@Database(entities = {FavSongs.class} , version = 1 ,exportSchema = false)
public abstract class MySongsDataBase extends RoomDatabase {

    private static MySongsDataBase mySongsDataBase;

    public abstract SongFavRepository songFavRepository();

    public static MySongsDataBase getMySongsDataBase(Context context){
        if (mySongsDataBase == null){
            synchronized (MySongsDataBase.class){
                if (mySongsDataBase == null){
                    mySongsDataBase = Room.databaseBuilder(context.getApplicationContext(),
                            MySongsDataBase.class,"MySongDatabase")
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return mySongsDataBase;
    }
}
