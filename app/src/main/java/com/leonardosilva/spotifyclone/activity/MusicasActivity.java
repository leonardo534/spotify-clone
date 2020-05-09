package com.leonardosilva.spotifyclone.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.leonardosilva.spotifyclone.R;
import com.leonardosilva.spotifyclone.fragments.NavHomeFragment;
import com.leonardosilva.spotifyclone.fragments.NavLibraryFragment;
import com.leonardosilva.spotifyclone.fragments.NavPremiumFragment;
import com.leonardosilva.spotifyclone.fragments.NavSearchFragment;

public class MusicasActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationMusicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicas);
        inicializarComponetes();

        bottomNavigationMusicas.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayoutMusicas, new NavHomeFragment()).commit();
    }

    private void inicializarComponetes(){
        bottomNavigationMusicas = findViewById(R.id.nav_menu);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event){

        if(keyCode == event.KEYCODE_BACK){
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            finish();
            return true;
        }else{
            return super.onKeyDown(keyCode, event);
        }
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
