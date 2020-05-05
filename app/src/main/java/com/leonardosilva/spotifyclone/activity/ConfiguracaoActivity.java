package com.leonardosilva.spotifyclone.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.leonardosilva.spotifyclone.R;
import com.leonardosilva.spotifyclone.fragments.NavHomeFragment;

public class ConfiguracaoActivity extends AppCompatActivity {
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
    }

    private void inicializarComponentes() {
        imageButtonVoltarConfiguracao = findViewById(R.id.imageButtonVoltarConfiguracao);
    }
}
