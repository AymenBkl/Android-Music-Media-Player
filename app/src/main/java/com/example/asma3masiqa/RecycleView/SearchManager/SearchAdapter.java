package com.example.asma3masiqa.RecycleView.SearchManager;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.asma3masiqa.R;

public class SearchAdapter {

    private SearchRecycleView searchRecycleView;
    private SearchCollection searchCollection;
    private EditText searchText;

    public SearchAdapter(){
        this.searchCollection = new SearchCollection();
        this.searchRecycleView = new SearchRecycleView(this.searchCollection);
    }

    public void setSearchs(View view, Context context){
        this.searchText = (EditText) view.findViewById(R.id.searchText);
        this.searchRecycleView.setRecyclerView(view,context);
        setListnerEdit();
    }

    private void setListnerEdit(){
        this.searchText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!String.valueOf(s).equalsIgnoreCase("")) {
                    searchCollection.onKeyPressed(String.valueOf(s));
                    searchRecycleView.update();
                }
            }
        });
    }
}
