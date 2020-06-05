package com.example.asma3masiqa.Fragments;

import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

public  class FragmentCommunication {

    private static int currentSong;
    private static boolean play;
    private static FragmentCommunication fragmentCommunication;

    private FragmentCommunication(){
        currentSong = -1;
        play = false;
    }

    public static boolean isPlay() {
        return play;
    }

    public static void setPlay(boolean play) {
        FragmentCommunication.play = play;
    }

    public int getCurrentSong() {
        return currentSong;

    }

    public void setCurrentSong(int currentSong) {
        this.play = true;
        if (currentSong >= MySongsPlayLists.getMySongsPlayLists().sizeFile()){
            this.currentSong = 0;
        }
        else if (currentSong < 0){
            this.currentSong = MySongsPlayLists.getMySongsPlayLists().sizeFile()-1;
        }
        else {
            this.currentSong = currentSong;
        }
    }


    public static FragmentCommunication getFragmentCommunication(){
        if (fragmentCommunication == null){
            synchronized (FragmentCommunication.class){
                if (fragmentCommunication == null){
                    fragmentCommunication = new FragmentCommunication();
                }
            }
        }
        return fragmentCommunication;
    }
}
