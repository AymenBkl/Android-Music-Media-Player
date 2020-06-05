package com.example.asma3masiqa.Threads;


public class MyMedeaPlayerThread extends MyThread {
    private static MyMedeaPlayerThread myMedeaPlayerThread;
    private MyMedeaPlayerThread(String name) {

        super(name);
    }
    public static MyMedeaPlayerThread getMyThread(){
        if (myMedeaPlayerThread == null){
            synchronized (MyMedeaPlayerThread.class){
                if (myMedeaPlayerThread == null){
                    myMedeaPlayerThread = new MyMedeaPlayerThread("My Medea Player Thread");
                }
            }
        }
        return myMedeaPlayerThread;
    }
}
