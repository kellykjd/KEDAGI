package com.example.whalemusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ActivityGeneros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generos);
        pegarFragment(new FragmentGeneros());
    }


    //creo el metodo para pegar fragment
    private void pegarFragment (Fragment fragment){
        //Busco el fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();
        //Creo una transaccion
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //Especifico los detalles de la transaccion
        fragmentTransaction.add(R.id.contenedorDeFragmentGenero, fragment, null);
        //recuerde a la transaccion para poder ir para atras
        fragmentTransaction.addToBackStack(null);
        //Ejecuto la transaccion
        fragmentTransaction.commit();
    }
}
