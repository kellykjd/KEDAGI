package com.example.whalemusic.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whalemusic.R;
import com.example.whalemusic.model.Cancion;

import java.util.ArrayList;
import java.util.List;

public class AdapterCancion extends RecyclerView.Adapter<AdapterCancion.ViewHolderCancion>{

    private List<Cancion> cancionList;
    private ListenerDelAdapterCancion listenerDelAdapterCancion;

    public AdapterCancion(List<Cancion> cancionList) {
        this.cancionList = cancionList;
    }

    public AdapterCancion(ListenerDelAdapterCancion listenerDelAdapterCancion) {
        cancionList = new ArrayList<>();
        this.listenerDelAdapterCancion = listenerDelAdapterCancion;
    }

    @NonNull
    @Override
    public ViewHolderCancion onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View vistaDeLaCelda =layoutInflater.inflate(R.layout.celda_cancion,parent,false);
        return new ViewHolderCancion(vistaDeLaCelda);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCancion holder, int position) {
        Cancion cancionMostrada = cancionList.get(position);
        holder.cargarCancion(cancionMostrada);

    }

    @Override
    public int getItemCount() {
        return cancionList.size();
    }

    public void setCancionList(List<Cancion> cancionList){
        this.cancionList = cancionList;
        notifyDataSetChanged();
    }


    public class ViewHolderCancion extends RecyclerView.ViewHolder{
        private TextView textViewNombre;
        private TextView textViewArtista;


        public ViewHolderCancion(@NonNull View itemView) {
            super(itemView);
            textViewNombre = itemView.findViewById(R.id.celdaCancion_textView_nombre);
            textViewArtista = itemView.findViewById(R.id.celdaCancion_textView_artista);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Cancion cancionSeleccionada = cancionList.get(getAdapterPosition());
                    listenerDelAdapterCancion.informarCancionSeleccionada(cancionSeleccionada);
                }
            });
        }

        public void cargarCancion(Cancion cancion){
            textViewNombre.setText(cancion.getNombre());
            textViewArtista.setText(cancion.getArtista());
        }
    }

    public interface ListenerDelAdapterCancion{
        public void informarCancionSeleccionada(Cancion cancion);
    }
}
