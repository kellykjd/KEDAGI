
package com.example.whalemusic.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whalemusic.model.Genero;
import com.example.whalemusic.R;

import java.util.ArrayList;
import java.util.List;



// A simple {@link Fragment} subclass.


public class FragmentDetalleGenero extends Fragment {

    private RecyclerView recyclerViewGeneros;

    public FragmentDetalleGenero() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View miView = inflater.inflate(R.layout.fragment_detalle_genero, container, false);

        // encuentro el recycler view
        recyclerViewGeneros.findViewById(R.id.fragmentGeneros_recyclerView);

        //creo el layout manager que es el que indica como se ve y como se escrolea la lista
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),2, RecyclerView.VERTICAL, false);

        //creo el adapter, el metodo que genera la lista lo saco afuera para que no ensucie el codigo
        //el dia de mañana esa lista va a venir de un servicio no va a esta harcodeada
        AdapterGenero adapterGenero = new AdapterGenero(generateList());

        //le seteo ek adapter al recycler
        recyclerViewGeneros.setLayoutManager(gridLayoutManager);

        //le seteo el layout manager
        recyclerViewGeneros.setAdapter(adapterGenero);

        return miView;
    }

    private List<Genero> generateList(){
        List<Genero> listaDeGeneros = new ArrayList<>();

        listaDeGeneros.add(new Genero("HipHop", R.drawable.hiphop));
        listaDeGeneros.add(new Genero("Cumbia Villera", R.drawable.cumbiavillera));
        listaDeGeneros.add(new Genero("Folklore", R.drawable.folklore));
        listaDeGeneros.add(new Genero("Reggaeton", R.drawable.reggaeton));
        listaDeGeneros.add(new Genero("Punk", R.drawable.punk));
        listaDeGeneros.add(new Genero("Psico Trance", R.drawable.psicotrance));

        return listaDeGeneros;
    }
}