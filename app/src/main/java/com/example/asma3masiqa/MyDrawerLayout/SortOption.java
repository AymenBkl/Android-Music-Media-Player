package com.example.asma3masiqa.MyDrawerLayout;

import android.util.Log;

public class SortOption {

    private static String sortoption ;
    private static SortOption sortOptions;
    private SortOption(){
        sortoption = "none";
    }

    public static String getSortoption() {
        return sortoption;
    }

    public static void setSortoption(String sortoptions) {
        sortoption = sortoptions;
    }

    public static SortOption getSortOption(){
        if (sortOptions == null){
                synchronized (SortOption.class){
                    if(sortOptions == null){
                        sortOptions = new SortOption();
                    }
                }
        }
        return sortOptions;
    }
}
