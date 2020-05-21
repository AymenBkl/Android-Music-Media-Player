package com.example.asma3masiqa.RecycleView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.asma3masiqa.Controllers.ButtonCommunicationsController;
import com.example.asma3masiqa.Controllers.ButtonsController;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;
import com.example.asma3masiqa.R;

import java.io.File;


public class SongsListAdapter extends RecyclerView.Adapter<SongsListAdapter.SongViewHolder> {

    private MySongsPlayLists mySongsPlayLists;
    private File[] files;
    private ButtonsController buttonsController;
    private ButtonCommunicationsController buttonCommunicationsController;

    public SongsListAdapter(File[] files){
        this.mySongsPlayLists = new MySongsPlayLists(files);
        this.files = files;
        this.buttonsController = new ButtonsController();
        this.buttonCommunicationsController = new ButtonCommunicationsController(this.buttonsController);
    }
    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mysong,parent,false);
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        holder.bindText(position);
        buttonsController.addButton(position,holder.itemView,mySongsPlayLists,buttonCommunicationsController);
    }

    @Override
    public int getItemCount() {
        return files.length;
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            initiate(itemView);
        }
        private final void initiate(View view){
            affectViews(view);
            FadeAnimation(view);
        }
        private void FadeAnimation(View view) {
            ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            anim.setDuration(1500);
            view.setAnimation(anim);
        }
        private void bindText(int position){
            this.textView.setText(mySongsPlayLists.songs[position].getName());
        }


        private void affectViews(View view){
            this.textView = (TextView) view.findViewById(R.id.filename);
        }


    }

}
