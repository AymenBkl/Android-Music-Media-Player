package com.example.asma3masiqa.Fragments;

public  class FragmentCommunication {

    private static int currentSong;
    private static FragmentCommunication fragmentCommunication;

    private FragmentCommunication(){
        currentSong = -1;
    }

    public int getCurrentSong() {
        return currentSong;
    }

    public void setCurrentSong(int currentSong) {
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
