package com.example.whalemusic.model;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nombre;
    private Integer foto;
    private String biografia;


    public Artista(String nombre, Integer foto, String biografia) {
        this.nombre = nombre;
        this.foto = foto;
        this.biografia = biografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
