package com.example.asma3masiqa.Permisions;


import android.util.Log;

import androidx.annotation.NonNull;

import com.example.asma3masiqa.MainActivity;

import java.util.List;



public abstract class MainActivityPermisions  {
    private MainActivity mainActivity;
    public abstract void showDialog();
    public MainActivityPermisions(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }


    public MainActivity getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
}
