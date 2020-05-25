package com.example.asma3masiqa.MyDrawerLayout;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.asma3masiqa.MainActivity;
import com.example.asma3masiqa.R;

public class MyDrawerLayout {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    public MyDrawerLayout(MainActivity mainActivity){
        this.drawerLayout = (DrawerLayout) mainActivity.findViewById(R.id.drawerLayout);
        setMyDrawerLayout(mainActivity);
    }
    public void setMyDrawerLayout(MainActivity mainActivity){
        this.actionBarDrawerToggle = new ActionBarDrawerToggle(mainActivity,
                this.drawerLayout,
                R.string.nav_app_bar_open_drawer_description,
                R.string.nav_app_bar_open_drawer_description);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        mainActivity.getSupportActionBar().setHomeButtonEnabled(true);
        mainActivity.getSupportActionBar().setDisplayShowHomeEnabled(true);
        mainActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        new MyNavigationView(mainActivity).setItemClick();
    }

    public ActionBarDrawerToggle getActionBarDrawerToggle() {
        return actionBarDrawerToggle;
    }

    public void setActionBarDrawerToggle(ActionBarDrawerToggle actionBarDrawerToggle) {
        this.actionBarDrawerToggle = actionBarDrawerToggle;
    }
}
