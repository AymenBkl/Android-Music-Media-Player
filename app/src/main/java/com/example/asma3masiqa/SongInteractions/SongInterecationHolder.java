package com.example.asma3masiqa.SongInteractions;

import android.util.Log;
import android.view.View;

import com.example.asma3masiqa.Controllers.BasicHolderControler;
import com.example.asma3masiqa.Controllers.InterctionHolderController;
import com.example.asma3masiqa.SongInteractions.SongInteracetionFactory.SongInfoFactory;
import com.example.asma3masiqa.SongInteractions.SongInteracetionFactory.SongInteractionFactory;
import com.example.asma3masiqa.SongInteractions.SongInteracetionFactory.SongInteractionHolderFactory;

public class SongInterecationHolder {
    private BasicHolderControler basicHolderControler;
    private InterctionHolderController interctionHolderController;

    public SongInterecationHolder(View view){
        this.basicHolderControler = new BasicHolderControler(SongInfoFactory.getLinearLayout(view));
        this.interctionHolderController = new InterctionHolderController(SongInteractionHolderFactory.getLinearLayout(view));
    }

    public void fromSongPlayerToSongList(){
        this.basicHolderControler.toGone();
        this.basicHolderControler.changeWeight();
        this.interctionHolderController.changeWeight();
    }

    public void fromSongListToSongPlayer(){
        this.basicHolderControler.changeWeightOriginal();
        this.basicHolderControler.toVisible();
        this.interctionHolderController.changeWeightOriginal();
    }
}
