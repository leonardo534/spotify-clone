package com.leonardosilva.spotifyclone.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationSubMenu;
import com.leonardosilva.spotifyclone.R;
import com.leonardosilva.spotifyclone.fragments.NavHomeFragment;
import com.leonardosilva.spotifyclone.fragments.NavLibraryFragment;
import com.leonardosilva.spotifyclone.fragments.NavPremiumFragment;
import com.leonardosilva.spotifyclone.fragments.NavSearchFragment;

public class MusicasActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicas);

        bottomNavigationView = findViewById(R.id.nav_menu);

        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayoutMusicas, new NavHomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment fragmentSelected = null;
                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            fragmentSelected = new NavHomeFragment();
                            break;

                        case R.id.nav_search:
                            fragmentSelected = new NavSearchFragment();
                            break;

                        case R.id.nav_library:
                            fragmentSelected = new NavLibraryFragment();
                            break;

                        case R.id.nav_premium:
                            fragmentSelected = new NavPremiumFragment();
                            break;
                        default:
                            fragmentSelected = new NavHomeFragment();
                    }

                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frameLayoutMusicas, fragmentSelected);
                    transaction.commit();
                    return true;
                }
            };
}
