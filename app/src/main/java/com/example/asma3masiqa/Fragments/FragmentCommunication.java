package com.example.asma3masiqa.Fragments;

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
        this.currentSong = currentSong;
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
