package com.leonardosilva.spotifyclone.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leonardosilva.spotifyclone.R;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class InitialScreenFragment extends Fragment {

    public InitialScreenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_initial_screen, container, false);

        return view;
    }
}
