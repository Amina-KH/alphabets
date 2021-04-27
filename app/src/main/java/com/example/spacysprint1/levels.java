package com.example.spacysprint1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class levels extends AppCompatActivity {
    MeowBottomNavigation bottomNavigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.levels);



        //put him by default on learn fragment
        //assign variables
        bottomNavigation = findViewById(R.id.bottom_navigation);
        //add menu items
        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_profil));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_learn));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_settings));


        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                //initialize fragments
                Fragment fragment = null;
                switch (item.getId()) {
                    case 1:
                        //when id is 1
                        //initialize settings fragments
                        fragment = new profilFragment();
                        break;
                    case 2:
                        //when id is 2
                        //initialize learning fragmen
                        fragment = new learnFragment();
                        break;
                    case 3:
                        fragment = new settingsFragment();


                }
                //loead fragment
                loadFragment(fragment);
            }
        });
        //navigate beetwen learn profil and settings
        bottomNavigation.show(2, true);
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {

            }
        });
bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
    @Override
    public void onReselectItem(MeowBottomNavigation.Model item) {

    }
});
    }

    private void loadFragment(Fragment fragment) {
        //Replace fragment
        //ndiro variable fragment li fiha settings wela learn wela el profil fe ---> layout fragment ta3na
        getSupportFragmentManager().beginTransaction().replace(R.id.fragement_container, fragment).commit();
    }
}


