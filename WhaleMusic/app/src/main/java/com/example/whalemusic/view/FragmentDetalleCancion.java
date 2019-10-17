package com.example.whalemusic.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.whalemusic.R;
import com.example.whalemusic.model.Cancion;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalleCancion extends Fragment {
    public static final String CLAVE_CANCION = "claveCancion";
    private TextView textViewNombre;
    private TextView textViewArtista;
    private TextView textViewAlbum;
    private TextView textViewAño;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_cancion, container, false);
        encontrarVistas(view);
        Bundle bundle = getArguments();
        Cancion cancionSeleccionada = (Cancion)bundle.getSerializable(CLAVE_CANCION);
        textViewNombre.setText(cancionSeleccionada.getNombre());
        textViewArtista.setText(cancionSeleccionada.getArtista());
        textViewAlbum.setText(cancionSeleccionada.getAlbum());
        textViewAño.setText(cancionSeleccionada.getAño().toString());
        return view;
    }

    private void encontrarVistas(View view){
        textViewNombre = view.findViewById(R.id.fragmentDetalleCancion_TextView_nombre);
        textViewArtista = view.findViewById(R.id.fragmentDetalleCancion_TextView_artista);
        textViewAlbum = view.findViewById(R.id.fragmentDetalleCancion_TextView_album);
        textViewAño = view.findViewById(R.id.fragmentDetalleCancion_TextView_año);
    }

}
