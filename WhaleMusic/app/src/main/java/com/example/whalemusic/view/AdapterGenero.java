
package com.example.whalemusic.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whalemusic.model.Genero;
import com.example.whalemusic.R;

import java.util.List;

public class AdapterGenero extends RecyclerView.Adapter<AdapterGenero.ViewHolderGenero> {

    private List<Genero> listaDeGeneros;

    public AdapterGenero (List<Genero>listaDeGeneros){
        this.listaDeGeneros = listaDeGeneros;
    }

    @NonNull
    @Override
    public ViewHolderGenero onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflador = LayoutInflater.from(parent.getContext());
        View view = inflador.inflate(R.layout.layoutgenero, parent, false);
        ViewHolderGenero viewHolderGenero = new ViewHolderGenero(view);
        return viewHolderGenero;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderGenero holder, int position) {
        Genero unGeneroDeLaLista = this.listaDeGeneros.get(position);
        holder.cargarGenero(unGeneroDeLaLista);
    }

    @Override
    public int getItemCount() {
        return this.listaDeGeneros.size();
    }

    public class ViewHolderGenero extends RecyclerView.ViewHolder {
        private TextView textViewGenero;
        private ImageView imageViewGenero;
        private Genero generoDeLaCelda;

        public ViewHolderGenero(@NonNull View itemView) {
            //EL ITEMVIEW ES LA CELDA DE LA LISTA

            super(itemView);
            //en la vista de la celda encuentro todos los componentes

            imageViewGenero = itemView.findViewById(R.id.imageViewGenero);
            textViewGenero = itemView.findViewById(R.id.layoutgenero_textView_genero);
        }

        //metodo que le enseña al view holder a cargar un objeto en este caso el villano
        public void cargarGenero (Genero genero){
            this.textViewGenero.setText(genero.getNombre());
            imageViewGenero.setImageResource(genero.getImagen());
        }
    }
}

