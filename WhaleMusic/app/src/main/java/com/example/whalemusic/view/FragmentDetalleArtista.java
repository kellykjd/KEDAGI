package com.example.whalemusic.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.whalemusic.R;
import com.example.whalemusic.model.Artista;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalleArtista extends Fragment {

    public static final String CLAVE_ARTISTA="claveArtista";
    private TextView textViewNombre;
    private TextView textViewBiografia;
    private ImageView imageViewFoto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_artista, container, false);
        encontrarVistas(view);
        Bundle bundle = getArguments();
        Artista artistaSeleccionado = (Artista)bundle.getSerializable(CLAVE_ARTISTA);
        imageViewFoto.setImageResource(artistaSeleccionado.getFoto());
        textViewNombre.setText(artistaSeleccionado.getNombre());
        textViewBiografia.setText(artistaSeleccionado.getBiografia());
        return view;
    }

    private void encontrarVistas(View view){
        textViewNombre = view.findViewById(R.id.fragmentDetalleArtista_TextView_nombre);
        textViewBiografia = view.findViewById(R.id.fragmentDetalleArtista_TextView_biografía);
        imageViewFoto = view.findViewById(R.id.fragmentDetalleArtista_ImageView_foto);
    }

}
