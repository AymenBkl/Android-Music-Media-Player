package com.example.asma3masiqa.RecycleView;

import android.content.Context;
import android.view.View;

import com.example.asma3masiqa.Animations.ImageRecycleViewAnimation;
import com.example.asma3masiqa.Animations.RelativeLayoutViewAnimation;

public class AnimationsRecycleView {

    private ImageRecycleViewAnimation imageRecycleViewAnimation;
    private RelativeLayoutViewAnimation relativeLayoutViewAnimation;
    public AnimationsRecycleView(Context context){
        this.imageRecycleViewAnimation = new ImageRecycleViewAnimation(context);
        this.relativeLayoutViewAnimation = new RelativeLayoutViewAnimation(context);
    }

    public void loadAnimations(View view1,View view2){
        this.imageRecycleViewAnimation.loadAnimation(view1);
        this.relativeLayoutViewAnimation.loadAnimation(view2);
    }
}
