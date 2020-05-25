package com.example.asma3masiqa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.Manifest;
import android.content.Intent;
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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.asma3masiqa.Dialogs.DownloadDialog;
import com.example.asma3masiqa.Dialogs.DownloadFromDialog;
import com.example.asma3masiqa.Dialogs.DownloadMenu.DownloadMenu;
import com.example.asma3masiqa.Files.FileE;
import com.example.asma3masiqa.Files.FileDownload;
import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.Fragments.SongPlayer;
import com.example.asma3masiqa.Fragments.SongsList;
import com.example.asma3masiqa.MediaPlayer.MyMediaPlayerSong;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;
import com.example.asma3masiqa.Permisions.InternetPermisions;
import com.example.asma3masiqa.Permisions.StoragePermissions;
import com.example.asma3masiqa.Threads.DownloadThread;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.io.File;
import java.io.IOException;
import java.util.List;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.AppSettingsDialog;
import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

public class MainActivity extends AppCompatActivity {
    public Handler handler;
    private DownloadMenu downloadMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler();
        this.downloadMenu = new DownloadMenu(MainActivity.this);
        StoragePermissions storagePermissions = new StoragePermissions(MainActivity.this);
        storagePermissions.showDialog();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return this.downloadMenu.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return this.downloadMenu.onOptionsItemSelected(item);
    }
}
