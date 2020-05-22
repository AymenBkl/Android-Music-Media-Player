package com.example.asma3masiqa.Files;

import android.os.Handler;

import com.example.asma3masiqa.MainActivity;


public abstract class Handlers {
    private Handler handler;
    private  MainActivity mainActivity;

    public Handlers(MainActivity mainActivity){
        this.mainActivity = mainActivity;
        this.handler = mainActivity.handler;
    }
    public abstract void doOperation();

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public MainActivity getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


}
