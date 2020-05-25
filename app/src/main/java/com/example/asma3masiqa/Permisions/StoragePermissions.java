package com.example.asma3masiqa.Permisions;

import android.Manifest;

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
                .setRationaleTitle("SOTRAGE PERMISSION")
                .setRationaleMessage("MASIQA NEED YOUR PERMISION IN ORDER TO DISPLAY YOUR SONGS")
                .setRationaleConfirmText("ALLOW")
                .setDeniedTitle("GO TO SETTINGS TO CHANGE PERMISIONS IN ORDER TO LISTEN")
                .setDeniedMessage("ADD STORAGE PERMISSION")
                .setDeniedCloseButtonText("close")
                .setGotoSettingButton(true)
                .setGotoSettingButtonText("Settings")
                .setPermissions(Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE)
                .setPermissionListener(storagePermisionListner.setPermisionListner())
                .check();
    }
}
