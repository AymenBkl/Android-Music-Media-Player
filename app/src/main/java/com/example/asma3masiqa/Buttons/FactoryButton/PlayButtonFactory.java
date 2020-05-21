package com.example.asma3masiqa.Buttons.FactoryButton;

import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.R;

public class PlayButtonFactory extends ButtonsFactory {

    public static Button getButton(View view){
        return (Button) view.findViewById(R.id.playable);
    };
}
