package com.example.asma3masiqa.Controllers;

import android.util.Log;
import android.widget.Button;

import com.example.asma3masiqa.Buttons.ButtonStrategy.ButtonsStrategy;
import com.example.asma3masiqa.Buttons.ButtonStrategy.NextOperation;

import java.util.ArrayList;
import java.util.List;

public class ButtonCommunicationsController {

    private int recentButton ;
    private ButtonsController buttonsController;
    private ButtonsStrategy buttonsStrategy;

    public ButtonCommunicationsController(ButtonsController buttonsController){
        this.buttonsController = buttonsController;
        this.recentButton = 0;
    }
    public boolean checks(int reciveid){
        if (reciveid != this.recentButton){
            changeStateButton(this.recentButton);
            this.recentButton = reciveid;
            return false;
        } else {
            return true;
        }
    }
    private void changeStateButton(int recentId){
        List<Button> recenctButtons = new ArrayList<Button>(this.buttonsController.getListButton(recentId));
        new NextOperation(recenctButtons.get(0),recenctButtons.get(2),recenctButtons.get(1)).doOperation();
    }
}
