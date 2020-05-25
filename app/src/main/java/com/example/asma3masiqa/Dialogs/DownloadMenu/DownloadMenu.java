package com.example.asma3masiqa.Dialogs.DownloadMenu;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;

import com.example.asma3masiqa.Dialogs.DownloadFromDialog;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.Permisions.InternetPermisions;
import com.example.asma3masiqa.R;

public class DownloadMenu{

    private MainActivity mainActivity;
    private DownloadFromDialog downloadFromDialog;
    private InternetPermisions internetPermisions;
    public DownloadMenu(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater downloadMenu = this.mainActivity.getMenuInflater();
        downloadMenu.inflate(R.menu.downloadmenu,menu);
        this.downloadFromDialog = new DownloadFromDialog(this.mainActivity);
        this.internetPermisions = new InternetPermisions(this.mainActivity,this.downloadFromDialog);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.downloadmenu:
                this.internetPermisions.showDialog();
                return true;
        }
        return this.mainActivity.onOptionsItemSelected(item);
    }
}
