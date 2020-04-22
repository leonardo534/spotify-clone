package com.leonardosilva.spotifyclone.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leonardosilva.spotifyclone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NavHomeFragment extends Fragment {

    public NavHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_nav_home, container, false);
    }
}
