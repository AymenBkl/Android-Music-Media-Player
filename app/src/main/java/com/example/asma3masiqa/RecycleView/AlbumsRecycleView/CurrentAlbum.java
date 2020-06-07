package com.example.asma3masiqa.RecycleView.AlbumsRecycleView;

public class CurrentAlbum {

    public static String currentAlbum = "All Music";
    public static String[] albums;
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
}
