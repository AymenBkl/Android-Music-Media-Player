package com.example.asma3masiqa.Animations;

import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;

import com.example.asma3masiqa.R;

public class RelativeLayoutViewAnimation extends Animations {

    public RelativeLayoutViewAnimation(Context context) {
        super(context);
    }

    @Override
    public void loadAnimation(View view) {
        view.setAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fadeanimationmysongholder));
    }
}
