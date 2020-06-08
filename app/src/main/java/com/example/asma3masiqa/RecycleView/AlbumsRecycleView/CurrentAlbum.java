package com.example.asma3masiqa.RecycleView.AlbumsRecycleView;

public class CurrentAlbum {

    private static String currentAlbum = "All Music";
    private static String prevouisAlbum = currentAlbum;
    private static String[] albums;
    public static String getCurrentAlbum() {
        return currentAlbum;
    }

    public static void setCurrentAlbum(String currentAlbum) {
        CurrentAlbum.currentAlbum = currentAlbum;
    }

    public static String[] getAlbums() {
        return albums;
    }

    public static void setAlbums(String[] albums) {
        CurrentAlbum.albums = albums;
    }

    public static String getPrevouisAlbum() {
        return prevouisAlbum;
    }

    public static void setPrevouisAlbum() {
        CurrentAlbum.prevouisAlbum = currentAlbum;
    }
}
