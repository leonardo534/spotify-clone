package com.leonardosilva.spotifyclone.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputEditText;
import com.leonardosilva.spotifyclone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private ImageButton imageButtonVoltar;
    private EditText editTextEmail;
    private TextInputEditText editTextSenha;
    Button buttonLoginEmail;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        imageButtonVoltar = view.findViewById(R.id.imageButtonVoltar);
        editTextEmail = view.findViewById(R.id.editTextEmail);
        editTextSenha = view.findViewById(R.id.editTextSenha);
        buttonLoginEmail = view.findViewById(R.id.buttonLoginEmail);

        imageButtonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
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
                verificar();

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
                verificar();
            }
        });
        return view;
    }

    private void verificar() {
        if ((editTextEmail.getText().length() == 0) || (editTextSenha.getText().length() == 0)) {
            buttonLoginEmail.setEnabled(false);
        } else {
            buttonLoginEmail.setEnabled(true);
        }
    }
}
