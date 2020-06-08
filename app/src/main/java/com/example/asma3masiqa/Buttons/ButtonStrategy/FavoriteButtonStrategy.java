package com.example.asma3masiqa.Buttons.ButtonStrategy;

import android.widget.Button;

import com.example.asma3masiqa.R;

public class FavoriteButtonStrategy extends ButtonsStrategy {

    private Button favButton;
    private boolean state;

    public FavoriteButtonStrategy(Button btn){
        this.favButton = btn;
    }
    @Override
    public void doOperation() {
        if (state){
            this.favButton.setBackgroundResource(R.drawable.ic_favorite_black_24dp);
        }
        else {
            this.favButton.setBackgroundResource(R.drawable.ic_favorite_border_black_24dp);
        }
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
