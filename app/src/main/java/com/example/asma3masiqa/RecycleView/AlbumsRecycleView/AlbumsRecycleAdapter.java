package com.example.asma3masiqa.RecycleView.AlbumsRecycleView;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asma3masiqa.R;

public class AlbumsRecycleAdapter extends RecyclerView.Adapter<AlbumsRecycleAdapter.AlbumsViewHolder> {


    @NonNull
    @Override
    public AlbumsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_albums_item,parent,false);
        return new AlbumsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumsViewHolder holder, int position) {
        holder.bindViews(position);
        holder.itemView.setOnClickListener(new AlbumClickListner().setListner(holder.textTitle));
    }

    @Override
    public int getItemCount() {
        return CurrentAlbum.getAlbums().length;
    }

    public class AlbumsViewHolder extends RecyclerView.ViewHolder{
        private ImageView myImageView;
        private TextView textTitle;
        public AlbumsViewHolder(@NonNull View itemView) {
            super(itemView);
            affectView(itemView);
        }

        public void bindViews(int position){
            this.textTitle.setText(CurrentAlbum.getAlbums()[position]);
        }

        public void affectView(View view){
            this.myImageView = (ImageView) view.findViewById(R.id.album_image);
            this.textTitle = (TextView) view.findViewById(R.id.album_title);
        }
    }
}
