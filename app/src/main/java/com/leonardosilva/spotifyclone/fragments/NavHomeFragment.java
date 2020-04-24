package com.leonardosilva.spotifyclone.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leonardosilva.spotifyclone.R;
import com.leonardosilva.spotifyclone.adapter.AdapterTocadaRecente;
import com.leonardosilva.spotifyclone.model.TocadaRecente;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class NavHomeFragment extends Fragment {

    public NavHomeFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerTocadasRecente;
    private List<TocadaRecente> tocadaRecenteList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav_home, container, false);
        recyclerTocadasRecente = view.findViewById(R.id.recyclerTocadasRecente);
        recyclerTocadasRecente.setHasFixedSize(true);

        //ADAPTER
        AdapterTocadaRecente adapterTocadaRecente = new AdapterTocadaRecente(tocadaRecenteList);

        //RECYCLERVIEW
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerTocadasRecente.setLayoutManager(layoutManager);
        recyclerTocadasRecente.setItemAnimator(new DefaultItemAnimator());
        recyclerTocadasRecente.setAdapter(adapterTocadaRecente);


        listarTocadasRecente();
        return view;
    }

    private void listarTocadasRecente() {
        TocadaRecente tocadaRecente = new TocadaRecente("Titulo 1", R.mipmap.img_capa_foreground);
        this.tocadaRecenteList.add(tocadaRecente);
        tocadaRecente = new TocadaRecente("Titulo 1", R.mipmap.img_capa_foreground);
        this.tocadaRecenteList.add(tocadaRecente);
        tocadaRecente = new TocadaRecente("Titulo 1", R.mipmap.img_capa_foreground);
        this.tocadaRecenteList.add(tocadaRecente);
        tocadaRecente = new TocadaRecente("Titulo 1", R.mipmap.img_capa_foreground);
        this.tocadaRecenteList.add(tocadaRecente);
        tocadaRecente = new TocadaRecente("Titulo 1", R.mipmap.img_capa_foreground);
        this.tocadaRecenteList.add(tocadaRecente);
        tocadaRecente = new TocadaRecente("Titulo 1", R.mipmap.img_capa_foreground);
        this.tocadaRecenteList.add(tocadaRecente);

    }
}
