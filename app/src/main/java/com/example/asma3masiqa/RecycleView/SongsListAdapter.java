package com.example.asma3masiqa.RecycleView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.asma3masiqa.Animations.ImageRecycleViewAnimation;
import com.example.asma3masiqa.Animations.RelativeLayoutViewAnimation;
import com.example.asma3masiqa.Controllers.ButtonCommunicationsController;
import com.example.asma3masiqa.Controllers.ButtonsController;
import com.example.asma3masiqa.Files.FileDownload;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;
import com.example.asma3masiqa.MyDrawerLayout.MyNavigationView;
import com.example.asma3masiqa.Obvserver.Obvserver;
import com.example.asma3masiqa.R;

import java.io.File;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class SongsListAdapter extends RecyclerView.Adapter<SongsListAdapter.SongViewHolder> implements Obvserver {

    private MySongsPlayLists mySongsPlayLists;
    private ButtonsController buttonsController;
    private ButtonCommunicationsController buttonCommunicationsController;
    private AnimationsRecycleView animationsRecycleView;

    public SongsListAdapter(){
        this.mySongsPlayLists = MySongsPlayLists.getMySongsPlayLists();
        this.buttonsController = new ButtonsController();
        this.buttonCommunicationsController = new ButtonCommunicationsController(this.buttonsController);
        FileDownload.getFileDownload(null).registerObvserver(this);
    }
    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mysong,parent,false);
        this.animationsRecycleView = new AnimationsRecycleView(parent.getContext());
        return new SongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        holder.bindViews(position);
        buttonsController.addButton(position,holder.itemView,mySongsPlayLists,buttonCommunicationsController);
    }

    @Override
    public int getItemCount() {
        return this.mySongsPlayLists.sizeFile();
    }

    @Override
    public void notifys() {
        this.notifyItemInserted(getItemCount());
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private CircleImageView circleImageView;
        private RelativeLayout relativeLayout;
        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            initiate(itemView);
        }
        private final void initiate(View view){
            affectViews(view);
        }

        private void bindViews(int position){
            this.textView.setText(mySongsPlayLists.songs.get(position).getName());
            animationsRecycleView.loadAnimations(this.circleImageView,this.relativeLayout);
        }


        private void affectViews(View view){
            this.circleImageView = (CircleImageView) view.findViewById(R.id.song_image);
            this.textView = (TextView) view.findViewById(R.id.filename);
            this.relativeLayout = (RelativeLayout) view.findViewById(R.id.mySongHolder);
        }


    }

}
