package com.example.asma3masiqa.Threads;

public class MyInterectionThread extends MyThread {
    private static MyInterectionThread myInterectionThread;
    private MyInterectionThread(String name) {
        super(name);
    }

    public static MyInterectionThread getMyThread(){
        if (myInterectionThread == null){
            synchronized (MyInterectionThread.class){
                if (myInterectionThread == null){
                    myInterectionThread = new MyInterectionThread("My interaction Thread");
                }
            }
        }
        return myInterectionThread;
    }
}
