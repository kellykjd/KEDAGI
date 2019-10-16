package com.example.whalemusic.view;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.example.whalemusic.R;
import com.google.android.material.chip.ChipGroup;

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
    private Button buttonSaltar;
    private Button buttonContinuar;
    private NotificadorActivity listener;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View viewMainFragment = inflater.inflate(R.layout.fragment_main, container, false);
        encontrarVistas(viewMainFragment);
        checkBoxPop.setOnCheckedChangeListener(new Chk_class());
        checkBoxIndie.setOnCheckedChangeListener(new Chk_class());
        checkBoxReggae.setOnCheckedChangeListener(new Chk_class());
        checkBoxCountry.setOnCheckedChangeListener(new Chk_class());
        checkBoxRock.setOnCheckedChangeListener(new Chk_class());
        checkBoxLatinas.setOnCheckedChangeListener(new Chk_class());

        buttonSaltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.recibirGeneros(seleccionDeGeneros());
            }
        });

        return viewMainFragment;
    }

    class Chk_class implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


            if(checkBoxPop.isChecked()||checkBoxCountry.isChecked()||checkBoxIndie.isChecked()||checkBoxLatinas.isChecked()||checkBoxRock.isChecked()||checkBoxReggae.isChecked())
            {
                buttonContinuar.setVisibility(View.VISIBLE);
                buttonSaltar.setVisibility(View.INVISIBLE);
            }else{
                buttonContinuar.setVisibility(View.INVISIBLE);
                buttonSaltar.setVisibility(View.VISIBLE);
            }
        }
    }

    private void encontrarVistas(View view){
        checkBoxRock = view.findViewById(R.id.MainFragment_checkBox_rock);
        checkBoxPop = view.findViewById(R.id.MainFragment_checkBox_pop);
        checkBoxIndie = view.findViewById(R.id.MainFragment_checkBox_indie);
        checkBoxReggae = view.findViewById(R.id.MainFragment_checkBox_reggae);
        checkBoxCountry = view.findViewById(R.id.MainFragment_checkBox_country);
        checkBoxLatinas = view.findViewById(R.id.MainFragment_checkBox_latinas);
        buttonSaltar = view.findViewById(R.id.MainFragment_button_saltar);
        buttonContinuar = view.findViewById(R.id.MainFragment_button_continuar);
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
