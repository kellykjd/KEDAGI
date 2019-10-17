package com.example.whalemusic.view;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.whalemusic.R;
import com.example.whalemusic.ResultListener;
import com.example.whalemusic.controller.ArtistaController;
import com.example.whalemusic.controller.CancionController;
import com.example.whalemusic.controller.GeneroController;
import com.example.whalemusic.model.Artista;
import com.example.whalemusic.model.Cancion;
import com.example.whalemusic.model.Genero;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentListas extends Fragment implements AdapterArtista.ListenerDelAdapterArtista, AdapterCancion.ListenerDelAdapterCancion, AdapterGenero.ListenerDelAdapterGenero {
    private RecyclerView recyclerViewArtistas;
    private RecyclerView recyclerViewCanciones;
    private RecyclerView recyclerViewGeneros;
    private Button buttonPop;
    private Button buttonRock;
    private Button buttonReggae;
    private Button buttonCountry;

    private ListenerDeFragment listenerDeFragment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_listas, container, false);
        encontrarVistas(view);
        final AdapterArtista adapterArtista = new AdapterArtista(this);
        final AdapterGenero adapterGenero = new AdapterGenero(this);
        final AdapterCancion adapterCancion = new AdapterCancion(this);
        ArtistaController artistaController = new ArtistaController();
        GeneroController generoController = new GeneroController();
        CancionController cancionController = new CancionController();
        artistaController.traerArtistas(new ResultListener<List<Artista>>() {
            @Override
            public void finish(List<Artista> result) {
                adapterArtista.setArtistaList(result);
            }
        });
        generoController.traerGeneros(new ResultListener<List<Genero>>() {
            @Override
            public void finish(List<Genero> result) {
                adapterGenero.setGeneroList(result);
            }
        });
        cancionController.traerCanciones(new ResultListener<List<Cancion>>() {
            @Override
            public void finish(List<Cancion> result) {
                adapterCancion.setCancionList(result);
            }
        });
        recyclerViewGeneros.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        recyclerViewGeneros.setAdapter(adapterGenero);
        recyclerViewArtistas.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        recyclerViewArtistas.setAdapter(adapterArtista);
        recyclerViewCanciones.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        recyclerViewCanciones.setAdapter(adapterCancion);
        return view;
    }

    private void encontrarVistas(View view){
        recyclerViewGeneros = view.findViewById(R.id.fragmentListas_recyclerViewGeneros);
        recyclerViewArtistas = view.findViewById(R.id.fragmentListas_recyclerViewArtistas);
        recyclerViewCanciones = view.findViewById(R.id.fragmentListas_recyclerViewCanciones);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listenerDeFragment = (ListenerDeFragment) context;
    }

    @Override
    public void informarArtistaSeleccionado(Artista artista) {
        listenerDeFragment.recibirArtista(artista);
    }

    @Override
    public void informarCancionSeleccionada(Cancion cancion) {
        listenerDeFragment.recibirCancion(cancion);
    }

    @Override
    public void informarGeneroSeleccionado(Genero genero) {
        listenerDeFragment.recibirGenero(genero);
    }


    public interface ListenerDeFragment {
        public void recibirArtista(Artista artista);
        public void recibirCancion(Cancion cancion);
        public void recibirGenero(Genero genero);
    }

}
