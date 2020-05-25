package com.example.asma3masiqa.SongInteractions;

public class SongShuffled {

    private static boolean shuffled;
    private static SongShuffled songShuffled;

    private SongShuffled(){
        shuffled = false;
    }
    public static boolean getShuffled(){
        return shuffled;
    }
    public static void setShuffled(boolean shuffle){
        shuffled = shuffle;
    }
    public static SongShuffled getSongShuffled(){
        if (songShuffled == null){
            synchronized (SongShuffled.class){
                if (songShuffled == null ){
                    songShuffled = new SongShuffled();
                }
            }
        }
        return songShuffled;
    }
}
