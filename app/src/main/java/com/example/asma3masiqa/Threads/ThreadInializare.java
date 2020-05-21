package com.example.asma3masiqa.Threads;

import android.os.HandlerThread;

public class ThreadInializare {

    public static MyThread inizialize(MyThread myThread){
        myThread.start();
        myThread.prepareHandler();
        return myThread;
    }
}
