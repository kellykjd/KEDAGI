
package com.example.whalemusic.model;

import java.util.ArrayList;
import java.util.List;

public class Genero {

    private String nombre;
    private Integer imagen;
    private List<Artista> artistas;

    public Genero(){

    }

    public Genero(String nombre, Integer imagen, List<Artista> artistas){
        this.nombre = nombre;
        this.imagen = imagen;
        this.artistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }
}
