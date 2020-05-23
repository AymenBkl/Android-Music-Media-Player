package com.example.asma3masiqa.Controllers;

import android.util.Log;

import com.example.asma3masiqa.MainActivity;

public class HolderController {

    private HolderFragment1Controler holderFragment1Controler;
    private HolderFragment2Controller holderFragment2Controller;
    public HolderController(MainActivity mainActivity){
        this.holderFragment1Controler = new HolderFragment1Controler(mainActivity);
        this.holderFragment2Controller = new HolderFragment2Controller(mainActivity);
    }

    public void fragment1ToFragment2(){
        this.holderFragment1Controler.toGone();
        this.holderFragment2Controller.toVisible();
    }

    public void fragment2toFragment1(){
       this.holderFragment1Controler.toVisible();
       this.holderFragment2Controller.changeWeight();
       this.holderFragment1Controler.changeWeight();
    }
}
