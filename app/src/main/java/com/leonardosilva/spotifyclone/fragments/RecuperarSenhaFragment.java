package com.leonardosilva.spotifyclone.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.leonardosilva.spotifyclone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecuperarSenhaFragment extends Fragment {

    private ImageButton imageButtonVoltarRecuperarSenha;
    private EditText editRecuperarSenha;
    private Button buttonRecuperarSenha;

    public RecuperarSenhaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recuperar_senha, container, false);
        imageButtonVoltarRecuperarSenha = view.findViewById(R.id.imageButtonVoltarRecuperarSenha);
        editRecuperarSenha = view.findViewById(R.id.editRecuperarSenha);
        buttonRecuperarSenha = view.findViewById(R.id.buttonRecuperarSenha);

        imageButtonVoltarRecuperarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        editRecuperarSenha.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                verificar();
            }
        });

        return view;
    }

    private void verificar() {
        if (editRecuperarSenha.getText().length() == 0) {
            buttonRecuperarSenha.setEnabled(false);
        }else{
            buttonRecuperarSenha.setEnabled(true);
        }
    }
}
