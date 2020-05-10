package com.leonardosilva.spotifyclone.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.leonardosilva.spotifyclone.R;
import com.leonardosilva.spotifyclone.fragments.NavHomeFragment;
import com.leonardosilva.spotifyclone.fragments.NavLibraryFragment;
import com.leonardosilva.spotifyclone.fragments.NavPremiumFragment;
import com.leonardosilva.spotifyclone.fragments.NavSearchFragment;

public class ConfiguracaoActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationConfigurações;
    private ImageButton imageButtonVoltarConfiguracao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracao);
        inicializarComponentes();

        imageButtonVoltarConfiguracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MusicasActivity.class);
                startActivity(intent);
                finish();
            }
        });

        bottomNavigationConfigurações.setOnNavigationItemSelectedListener(navListener);
    }

    private void inicializarComponentes() {
        imageButtonVoltarConfiguracao = findViewById(R.id.imageButtonVoltarConfiguracao);
        bottomNavigationConfigurações = findViewById(R.id.nav_menu);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment fragmentSelected = null;
                    switch (item.getItemId()) {
                        case R.id.nav_home:
                            Intent intent = new Intent(getApplicationContext(), MusicasActivity.class);
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
