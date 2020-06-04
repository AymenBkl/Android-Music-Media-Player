package com.example.asma3masiqa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
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
import android.view.Window;
import android.view.WindowManager;
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
import com.example.asma3masiqa.MusicPlayerService.MusicPlayerService;
import com.example.asma3masiqa.MyDrawerLayout.MyDrawerLayout;
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
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private Intent intentService;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
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

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {

        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
    }

    @Override
    protected void onResume() {

        super.onResume();

    }

    @Override
    protected void onPause() {
        Log.i("lol","xdpaused");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        MyFragmentManager.getMyFragmentManager(MainActivity.this).detachFragment();
        Log.i("lol","xddeeestroyed");
        super.onDestroy();
    }


    public void startService(){
        this.intentService = new Intent(this, MusicPlayerService.class);
        startService(this.intentService);
    }

    public void stopService(){
        stopService(this.intentService);
    }

}
