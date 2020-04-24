package com.leonardosilva.spotifyclone.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.leonardosilva.spotifyclone.R;
import com.leonardosilva.spotifyclone.activity.MusicasActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ConfiguracaoFragment extends Fragment {
    private ImageButton imageButtonVoltarConfiguracao;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_configuracao, container, false);
        imageButtonVoltarConfiguracao = view.findViewById(R.id.imageButtonVoltarConfiguracao);

        imageButtonVoltarConfiguracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), MusicasActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
