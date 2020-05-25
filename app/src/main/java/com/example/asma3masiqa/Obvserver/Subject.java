package com.example.asma3masiqa.Obvserver;

public interface Subject {
    public void registerObvserver(Obvserver obvserver);

    public void unregisterObvserver(Obvserver obvserver);

    public void notifysAll();
}
