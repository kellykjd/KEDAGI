package com.example.whalemusic;

public class Genero {

    private String nombre;
    private Integer imagen;

    public Genero(){

    }

    public Genero(String nombre, Integer imagen){
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setImagen(Integer imagen){
        this.imagen = imagen;
    }

    public String getNombre(){
        return nombre;
    }

    public Integer getImagen(){
        return imagen;
    }
}
