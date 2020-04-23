package com.leonardosilva.spotifyclone.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.leonardosilva.spotifyclone.R;
import com.leonardosilva.spotifyclone.model.TocadaRecente;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterTocadaRecente extends RecyclerView.Adapter<AdapterTocadaRecente.MyViewHolder>{

    private List<TocadaRecente> tocadaRecenteList = new ArrayList<>();

    public AdapterTocadaRecente(List<TocadaRecente> tocadaRecenteList) {
        this.tocadaRecenteList = tocadaRecenteList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_tocada_recente, parent, false);
        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TocadaRecente tocadaRecente = tocadaRecenteList.get(position);

        holder.titulo.setText(tocadaRecente.getTitulo());
        holder.imagem.setImageResource(tocadaRecente.getImagem());
    }

    @Override
    public int getItemCount() {
        return tocadaRecenteList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        ImageView imagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTituloTocadaRecente);
            imagem = itemView.findViewById(R.id.imageTocadaRecente);

        }
    }

}
