package com.example.whalemusic;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


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
        return inflater.inflate(R.layout.fragment_fragment_generos, container, false);

        // encuentro el recycler view
        RecyclerView recyclerView = findViewById(R.id.fragmentGeneros_recyclerView);

        //creo el layout manager que es el que indica como se ve y como se escrolea la lista
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);

        //creo el adapter, el metodo que genera la lista lo saco afuera para que no ensucie el codigo
        //el dia de mañana esa lista va a venir de un servicio no va a esta harcodeada

        AdapterGenero adapterGenero = new AdapterGenero(listaDeGeneros);

        recyclerViewGeneros.setAdapter(adadapterGenero);
    }
}
