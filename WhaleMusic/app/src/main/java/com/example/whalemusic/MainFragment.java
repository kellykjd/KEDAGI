package com.example.whalemusic;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private CheckBox checkBoxRock;
    private CheckBox checkBoxPop;
    private CheckBox checkBoxIndie;
    private CheckBox checkBoxReggae;
    private CheckBox checkBoxCountry;
    private CheckBox checkBoxLatinas;
    private Button buttonSkip;
    private NotificadorActivity listener;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewMainFragment = inflater.inflate(R.layout.fragment_main, container, false);
        encontrarVistas(viewMainFragment);

        buttonSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.recibirGeneros(seleccionDeGeneros());
            }
        });









        return viewMainFragment;
    }

    private void encontrarVistas(View view){
        checkBoxRock = view.findViewById(R.id.MainFragment_checkBox_rock);
        checkBoxPop = view.findViewById(R.id.MainFragment_checkBox_pop);
        checkBoxIndie = view.findViewById(R.id.MainFragment_checkBox_indie);
        checkBoxReggae = view.findViewById(R.id.MainFragment_checkBox_reggae);
        checkBoxCountry = view.findViewById(R.id.MainFragment_checkBox_country);
        checkBoxLatinas = view.findViewById(R.id.MainFragment_checkBox_latinas);
        buttonSkip = view.findViewById(R.id.MainFragment_button_skip);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (NotificadorActivity) context;
    }

    public interface NotificadorActivity{
        public void recibirGeneros(List<String> generos);
    }

    private List<String> seleccionDeGeneros(){
        List<String> generos = new ArrayList<>();
        if (checkBoxRock.isChecked()){
            generos.add("Rock");
        }
        if (checkBoxPop.isChecked()){
            generos.add("Pop");
        }
        if (checkBoxIndie.isChecked()){
            generos.add("Indie");
        }
        if (checkBoxReggae.isChecked()){
            generos.add("Reggae");
        }
        if (checkBoxCountry.isChecked()){
            generos.add("Country");
        }
        if (checkBoxLatinas.isChecked()){
            generos.add("Metal");
        }
        return generos;
    }
}
