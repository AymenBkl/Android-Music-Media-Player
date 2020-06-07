package com.example.asma3masiqa.RecycleView.SearchManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asma3masiqa.R;
import com.example.asma3masiqa.RecycleView.AnimationsRecycleView;
import com.example.asma3masiqa.SongManipulation.OnClickListner;
import com.example.asma3masiqa.SongManipulation.SearchViewListner;

import de.hdodenhof.circleimageview.CircleImageView;

public class SearchSongsAdapter extends RecyclerView.Adapter<SearchSongsAdapter.SongViewHolder> {
    private AnimationsRecycleView animationsRecycleView;
    private SearchCollection searchCollection;
    public SearchSongsAdapter(SearchCollection searchCollection){
        this.searchCollection = searchCollection;
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
        holder.itemView.setOnClickListener(new SearchViewListner(null,null,searchCollection.searchSongs.get(position)).onClickListeners());
    }

    @Override
    public int getItemCount() {
        return searchCollection.searchSongs.size();
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
            this.textView.setText(searchCollection.searchSongs.get(position).getName());
            animationsRecycleView.loadAnimations(this.circleImageView,this.relativeLayout);
        }


        private void affectViews(View view){
            this.circleImageView = (CircleImageView) view.findViewById(R.id.song_image);
            this.textView = (TextView) view.findViewById(R.id.filename);
            this.relativeLayout = (RelativeLayout) view.findViewById(R.id.mySongHolder);
        }


    }
    }

