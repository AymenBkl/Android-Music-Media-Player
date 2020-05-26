package com.example.asma3masiqa.SongManipulation;

import android.app.Dialog;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.asma3masiqa.Buttons.FactoryButton.CancelDialogButton;

public class CancelListner {

    private Button cancel;

    public CancelListner(View view, Dialog dialog){
        this.cancel = CancelDialogButton.getButton(view);
        affectListner(dialog);
    }

    private void affectListner(final Dialog dialog){
        this.cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

}
