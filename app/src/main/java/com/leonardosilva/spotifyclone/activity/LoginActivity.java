 package com.leonardosilva.spotifyclone.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.leonardosilva.spotifyclone.R;

 public class LoginActivity extends AppCompatActivity {
    private ImageButton imageButtonVoltar;
    private Button buttonLoginEmail;
    private EditText editTextEmail;
    private EditText editTextSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inicializarComponentes();

        imageButtonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        editTextEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                verificarStatus();
            }
        });

        editTextSenha.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                verificarStatus();
            }
        });

        buttonLoginEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MusicasActivity.class);
                startActivity(intent);
            }
        });
    }

    private void inicializarComponentes(){
        imageButtonVoltar = findViewById(R.id.imageButtonVoltar);
        buttonLoginEmail = findViewById(R.id.buttonLoginEmail);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextSenha = findViewById(R.id.editTextSenha);
    }

    private void verificarStatus(){
        if(editTextEmail.getText().length() == 0 || editTextSenha.getText().length() == 0){
            buttonLoginEmail.setEnabled(false);
        }else{
            buttonLoginEmail.setEnabled(true);
        }

    }
}
