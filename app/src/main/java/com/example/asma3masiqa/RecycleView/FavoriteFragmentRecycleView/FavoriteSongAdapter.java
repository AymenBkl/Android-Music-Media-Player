package com.example.asma3masiqa.RecycleView.FavoriteFragmentRecycleView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asma3masiqa.Buttons.FavoriteButton;
import com.example.asma3masiqa.R;
import com.example.asma3masiqa.RecycleView.AnimationsRecycleView;
import com.example.asma3masiqa.RecycleView.SearchManager.SearchCollection;
import com.example.asma3masiqa.RecycleView.SearchManager.SearchSongsAdapter;

import de.hdodenhof.circleimageview.CircleImageView;

public class FavoriteSongAdapter extends RecyclerView.Adapter<FavoriteSongAdapter.FavoriteSongHolder> {

    private AnimationsRecycleView animationsRecycleView;
    private FavoriteSongsCollection favoriteSongsCollection;

    public FavoriteSongAdapter(FavoriteSongsCollection favoriteSongsCollection){
        this.favoriteSongsCollection = favoriteSongsCollection;
    }
    @NonNull
    @Override
    public FavoriteSongHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mysong,parent,false);
        this.animationsRecycleView = new AnimationsRecycleView(parent.getContext());
        return new FavoriteSongHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteSongHolder holder, int position) {
        holder.bindViews(position);
        holder.itemView.setOnClickListener(new FavoriteSongOnClick().setListner(this.favoriteSongsCollection.myFavSongs.get(position)));
    }

    @Override
    public int getItemCount() {
        return this.favoriteSongsCollection.myFavSongs.size();
    }

    public class FavoriteSongHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        private CircleImageView circleImageView;
        private RelativeLayout relativeLayout;
        public FavoriteSongHolder(@NonNull View itemView) {
            super(itemView);
            initiate(itemView);
        }
        private final void initiate(View view){
            affectViews(view);
        }

        private void bindViews(int position){
            this.textView.setText(favoriteSongsCollection.myFavSongs.get(position).getName());
            animationsRecycleView.loadAnimations(this.circleImageView,this.relativeLayout);
        }


        private void affectViews(View view){
            this.circleImageView = (CircleImageView) view.findViewById(R.id.song_image);
            this.textView = (TextView) view.findViewById(R.id.filename);
            this.relativeLayout = (RelativeLayout) view.findViewById(R.id.mySongHolder);
        }
    }
}
