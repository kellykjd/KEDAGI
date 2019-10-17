

package com.example.whalemusic.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.whalemusic.R;
import com.example.whalemusic.model.Artista;
import com.example.whalemusic.model.Cancion;
import com.example.whalemusic.model.Genero;

import java.util.List;

public class MainActivity extends AppCompatActivity implements FragmentListas.ListenerDeFragment {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pegarFragment(new FragmentListas());

    }


    private void pegarFragment(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainActivity_contenedorFragments,fragment,null)
                .addToBackStack(null)
                .commit();
    }


    @Override
    public void recibirArtista(Artista artista) {
        FragmentDetalleArtista fragmentDetalleArtista = new FragmentDetalleArtista();
        Bundle bundle = new Bundle();
        bundle.putSerializable(FragmentDetalleArtista.CLAVE_ARTISTA,artista);
        fragmentDetalleArtista.setArguments(bundle);
        pegarFragment(fragmentDetalleArtista);

    }

    @Override
    public void recibirCancion(Cancion cancion) {
        FragmentDetalleCancion fragmentDetalleCancion = new FragmentDetalleCancion();
        Bundle bundle = new Bundle();
        bundle.putSerializable(FragmentDetalleCancion.CLAVE_CANCION,cancion);
        fragmentDetalleCancion.setArguments(bundle);
        pegarFragment(fragmentDetalleCancion);
    }

    @Override
    public void recibirGenero(Genero genero) {
        FragmentDetalleGenero fragmentDetalleGenero = new FragmentDetalleGenero();
        Bundle bundle = new Bundle();
        bundle.putSerializable(FragmentDetalleGenero.CLAVE_GENERO,genero);
        fragmentDetalleGenero.setArguments(bundle);
        pegarFragment(fragmentDetalleGenero);
    }
}
