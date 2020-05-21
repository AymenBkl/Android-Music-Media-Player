package com.example.asma3masiqa.Files;

import android.net.Uri;

public class FileE {
    private String name;
    private float size;
    private String location;
    private Uri uri;

    public FileE(String name, float size, String location, Uri uri){
        this.name = name;
        this.size = size;
        this.location = location;
        this.uri = uri;
    }

    public FileE(String name,String location){
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }
}
