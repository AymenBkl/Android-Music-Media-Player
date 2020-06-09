package com.example.asma3masiqa.Permisions;

import android.Manifest;
import android.util.Log;
import android.widget.Toast;

import com.example.asma3masiqa.Dialogs.DownloadFromDialog;
import com.example.asma3masiqa.Dialogs.DownloadMenu.DownloadMenu;
import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.Permisions.PermistionTedListner.InternetPermision;
import com.gun0912.tedpermission.TedPermission;


public class InternetPermisions extends MainActivityPermisions {
    private DownloadFromDialog downloadFromDialog;
    public InternetPermisions(MainActivity mainActivity,DownloadFromDialog downloadFromDialog) {
        super(mainActivity);
        this.downloadFromDialog = downloadFromDialog;
    }

    public void showDialog(){
        InternetPermision internetPermision = new InternetPermision(this.downloadFromDialog);
        TedPermission.with(getMainActivity())
                .setDeniedTitle("GO TO SETTINGS TO CHANGE PERMISIONS IN ORDER TO LISTEN")
                .setDeniedMessage("ADD STORAGE PERMISSION")
                .setGotoSettingButton(true)
                .setGotoSettingButtonText("SETTINGS")
                .setRationaleTitle("INTERNET AND SOTRAGE PERMISSION NOT GRANTED")
                .setRationaleMessage("MASIQA NEED YOUR INTERNET AND STORAGE PERMISION IN TO DOWNLOAD YOUR SONG")
                .setDeniedCloseButtonText("DENY")
                .setRationaleConfirmText("ALLOW")
                .setPermissions(Manifest.permission.INTERNET,Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .setPermissionListener(internetPermision.setPermisionListner())
                .check();
    }
}
