package com.example.asma3masiqa.Permisions.PermistionTedListner;

import android.util.Log;
import android.widget.Toast;

import com.example.asma3masiqa.Dialogs.DownloadFromDialog;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.List;

public class InternetPermision extends PermisionTedListner {
    private DownloadFromDialog downloadFromDialog;

    public InternetPermision(DownloadFromDialog downloadFromDialog){
        this.downloadFromDialog = downloadFromDialog;
    }
    @Override
    public PermissionListener setPermisionListner() {
        return new PermissionListener() {
            @Override
            public void onPermissionGranted() {
                downloadFromDialog.doOperation();
            }

            @Override
            public void onPermissionDenied(List<String> deniedPermissions) {
            }
        };
    }
}
