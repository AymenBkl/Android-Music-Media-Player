package com.example.asma3masiqa.Animations;

import android.content.Context;
import android.view.View;

public abstract class Animations {

    private Context context;

    public Animations(Context context){
        this.context = context;
    }
    public abstract void loadAnimation(View view);

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
