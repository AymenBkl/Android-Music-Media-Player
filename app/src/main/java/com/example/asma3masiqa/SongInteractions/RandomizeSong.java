package com.example.asma3masiqa.SongInteractions;

import android.util.Log;

import java.util.Random;

public class RandomizeSong {

    public static int getSongRandom(int size){
        Random random = new Random();
        return  random.nextInt(size);

    }
}
