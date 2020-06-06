package com.example.asma3masiqa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;


import com.example.asma3masiqa.Buttons.ButtonStrategy.DropDownStrategy;
import com.example.asma3masiqa.Dialogs.DownloadMenu.DownloadMenu;
import com.example.asma3masiqa.Files.FileDownload;
import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.MusicPlayerService.MusicPlayerService;
import com.example.asma3masiqa.Permisions.StoragePermissions;
import com.example.asma3masiqa.Threads.DownloadThread;
import com.example.asma3masiqa.Threads.MyInterectionThread;
import com.example.asma3masiqa.Threads.ThreadDestroyer;


public class MainActivity extends AppCompatActivity {
    public Handler handler;
    private DownloadMenu downloadMenu;


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
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        ThreadDestroyer.destroy(MyInterectionThread.getMyThread());
        ThreadDestroyer.destroy(DownloadThread.getMyThread());
        MyFragmentManager.getMyFragmentManager(MainActivity.this).detachFragment();
        startService();
        FileDownload.getFileDownload(null).destroy();
        DropDownStrategy.destroy();
        super.onDestroy();
    }


    public void startService(){
        Intent intentService = new Intent(this, MusicPlayerService.class);
        startService(intentService);

    }

}
