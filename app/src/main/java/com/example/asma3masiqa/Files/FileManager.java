package com.example.asma3masiqa.Files;
import android.content.Context;
import com.example.asma3masiqa.MainActivity;

public abstract class FileManager {
    public Runnable runnable;
    private MainActivity mainActivity;

    public FileManager(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    public Runnable getRunnable() {
        return runnable;
    }

    public void setRunnable(Runnable runnable) {
        this.runnable = runnable;
    }

    public MainActivity getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }



    public Context getContext(){
        return this.mainActivity.getApplicationContext();
    }

}
