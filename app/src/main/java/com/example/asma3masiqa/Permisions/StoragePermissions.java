package com.example.asma3masiqa.Permisions;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.Permisions.PermistionTedListner.StoragePermisionListner;
import com.example.asma3masiqa.R;
import com.gun0912.tedpermission.TedPermission;

public class StoragePermissions extends MainActivityPermisions {
    public StoragePermissions(MainActivity mainActivity) {
        super(mainActivity);
    }

    @Override
    public void showDialog() {

        StoragePermisionListner storagePermisionListner = new StoragePermisionListner(getMainActivity());
        TedPermission.with(getMainActivity())
                .setPermissionListener(storagePermisionListner.setPermisionListner())
                .setPermissions(Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .setDeniedTitle("IN SETTING YOU CAN TURN GRANT THE PERMISSIONS")
                .setDeniedMessage("ADD STORAGE PERMISSION")
                .setGotoSettingButton(true)
                .setGotoSettingButtonText("SETTINGS")
                .setRationaleTitle("SOTRAGE PERMISSION NOT GRANTED")
                .setRationaleMessage("MASIQA NEED YOUR STORAGE PERMISSION IN ORDER TO DISPLAY YOUR SONGS")
                .setDeniedCloseButtonText("DENY")
                .setRationaleConfirmText("ALLOW")
                .setPermissionListener(storagePermisionListner.setPermisionListner())
                .check();
    }
}
