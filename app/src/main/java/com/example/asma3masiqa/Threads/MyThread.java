package com.example.asma3masiqa.Threads;

import android.os.Handler;
import android.os.HandlerThread;

public abstract class MyThread extends HandlerThread implements HandlerOperations {

    private Handler handler;

    public MyThread(String name) {
        super(name);
    }

    public MyThread(String name, int priority) {
        super(name, priority);
    }
    public void prepareHandler(){
        this.handler = new Handler(getLooper());
    }

    public void assignTask(Runnable task){
        this.handler.post(task);
    }

}
