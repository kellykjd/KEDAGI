
package com.example.whalemusic;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */

public class FragmentGeneros extends Fragment {

    private RecyclerView recyclerViewGeneros;

    public FragmentGeneros() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View miView = inflater.inflate(R.layout.fragment_fragment_generos, container, false);

        // encuentro el recycler view
        recyclerViewGeneros.findViewById(R.id.fragmentGeneros_recyclerView);

        //creo el layout manager que es el que indica como se ve y como se escrolea la lista
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, true);

        //creo el adapter, el metodo que genera la lista lo saco afuera para que no ensucie el codigo
        //el dia de mañana esa lista va a venir de un servicio no va a esta harcodeada
        AdapterGenero adapterGenero = new AdapterGenero(generateList());

        //le seteo ek adapter al recycler
        recyclerViewGeneros.setLayoutManager(layoutManager);

        //le seteo el layout manager
        recyclerViewGeneros.setAdapter(adapterGenero);

        return miView;
    }

    private List<Genero> generateList(){
        List<Genero> listaDeGeneros = new ArrayList<>();

        listaDeGeneros.add(new Genero("HipHop", 1));
        listaDeGeneros.add(new Genero("Cumbia Villera", 1));
        listaDeGeneros.add(new Genero("Reggae", 1));
        listaDeGeneros.add(new Genero("Musica Clasica", 1));
        listaDeGeneros.add(new Genero("Punk", 1));
        listaDeGeneros.add(new Genero("Rock", 1));

        return listaDeGeneros;
    }
}
