
package com.example.whalemusic.view;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.whalemusic.model.Genero;
import com.example.whalemusic.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;



// A simple {@link Fragment} subclass.


public class FragmentDetalleGenero extends Fragment {

public static final String CLAVE_GENERO = "claveGenero";
private TextView textViewNombre;
private ImageView imageViewFoto;
private TextView textViewArtistas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle_genero, container, false);
        encontrarVistas(view);
        Bundle bundle = getArguments();
        Genero generoSeleccionado = (Genero) bundle.getSerializable(CLAVE_GENERO);
        imageViewFoto.setImageResource(generoSeleccionado.getImagen());
        textViewNombre.setText(generoSeleccionado.getNombre());
        textViewArtistas.setText(generoSeleccionado.getArtistas());



        return view;

    }


    private void encontrarVistas(View view){
        imageViewFoto = view.findViewById(R.id.fragmentDetalleGenero_ImageView_foto);
        textViewNombre = view.findViewById(R.id.fragmentDetalleGenero_TextView_nombre);
        textViewArtistas = view.findViewById(R.id.fragmentDetalleGenero_TextView_listaArtistas);
    }

}