package com.example.asma3masiqa.Permisions.PermistionTedListner;

import android.util.Log;
import android.widget.Toast;

import com.example.asma3masiqa.Fragments.MyFragmentManager;
import com.example.asma3masiqa.MainActivity;
import com.gun0912.tedpermission.PermissionListener;

import java.util.List;

public class StoragePermisionListner extends PermisionTedListner {
    private MainActivity mainActivity;

    public StoragePermisionListner(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }
    @Override
    public PermissionListener setPermisionListner() {
        return new PermissionListener() {
            @Override
            public void onPermissionGranted() {
                MyFragmentManager.getMyFragmentManager(mainActivity).loadMainFragment();
            }

            @Override
            public void onPermissionDenied(List<String> deniedPermissions) {
                Toast.makeText(mainActivity,"Cant Load Songs",Toast.LENGTH_LONG).show();
            }
        };
    }
}
