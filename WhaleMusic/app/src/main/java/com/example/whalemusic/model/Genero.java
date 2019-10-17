
package com.example.whalemusic.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Genero implements Serializable {

    private String nombre;
    private Integer imagen;
    private String artistas;

    public Genero(){

    }

    public Genero(String nombre, Integer imagen, String artistas){
        this.nombre = nombre;
        this.imagen = imagen;
        this.artistas = artistas;
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

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }
}
