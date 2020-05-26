package com.example.asma3masiqa.Threads;

public class ThreadDestroyer {
    private static final ThreadDestroyer ourInstance = new ThreadDestroyer();

    public static ThreadDestroyer getInstance() {
        return ourInstance;
    }

    private ThreadDestroyer() {
    }
}
