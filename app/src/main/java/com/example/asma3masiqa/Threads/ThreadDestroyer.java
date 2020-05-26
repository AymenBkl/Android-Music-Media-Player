package com.example.asma3masiqa.Threads;

import android.util.Log;

public class ThreadDestroyer {

    public static void destroy(MyThread myThread){
        myThread.quit();
        myThread = null;
    }
}
