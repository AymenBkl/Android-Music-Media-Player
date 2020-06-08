package com.example.asma3masiqa.RecycleView.AlbumsRecycleView;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.asma3masiqa.Buttons.FactoryButton.FavoriteButtonFactory;
import com.example.asma3masiqa.Buttons.FavoriteButton;
import com.example.asma3masiqa.Fragments.GlobalFragmentManager;
import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.MediaPlayer.MySongsPlayLists;

import org.w3c.dom.Text;

public class AlbumClickListner {


    public View.OnClickListener setListner(final TextView textView){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CurrentAlbum.setCurrentAlbum(textView.getText().toString());
                MySongsPlayLists.getMySongsPlayLists().notifys();
                GlobalFragmentManager.getGlobalFragmentManager(null,null).loadPlaylistFragment();
            }
        };
    }
}
