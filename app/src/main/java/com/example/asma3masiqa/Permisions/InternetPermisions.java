package com.example.asma3masiqa.Permisions;

import android.Manifest;
import android.util.Log;
import android.widget.Toast;

import com.example.asma3masiqa.Dialogs.DownloadFromDialog;
import com.example.asma3masiqa.Dialogs.DownloadMenu.DownloadMenu;
import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.Permisions.PermistionTedListner.InternetPermision;
import com.example.asma3masiqa.Permisions.PermistionTedListner.PermisionTedListner;
import com.gun0912.tedpermission.TedPermission;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.AppSettingsDialog;
import pub.devrel.easypermissions.EasyPermissions;

public class InternetPermisions extends MainActivityPermisions {
    private DownloadFromDialog downloadFromDialog;
    public InternetPermisions(MainActivity mainActivity,DownloadFromDialog downloadFromDialog) {
        super(mainActivity);
        this.downloadFromDialog = downloadFromDialog;
    }

    public void showDialog(){
        InternetPermision internetPermision = new InternetPermision(this.downloadFromDialog);
        TedPermission.with(getMainActivity())
                .setRationaleTitle("INTERNET PERMISSION")
                .setRationaleMessage("MASIQA NEED YOUR PERMISION IN ORDER TO DOWNLOAD THE SONG")
                .setRationaleConfirmText("ALLOW")
                .setDeniedMessage("DENY")
                .setDeniedTitle("GO TO SETTINGS TO CHANGE PERMISIONS")
                .setDeniedMessage("ADD INTERNET PERMISSION")
                .setDeniedCloseButtonText("DENY")
                .setPermissions(Manifest.permission.INTERNET,Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .setPermissionListener(internetPermision.setPermisionListner())
                .check();
    }
}
