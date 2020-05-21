package com.example.asma3masiqa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.asma3masiqa.Files.FileE;
import com.example.asma3masiqa.Files.FileDownload;
import com.example.asma3masiqa.Fragments.SongsList;
import com.example.asma3masiqa.Threads.DownloadThread;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.playlistfragment,new SongsList(new File(Environment.getExternalStorageDirectory()+"/Music/").listFiles()));
        fragmentTransaction.commit();

    }

}
