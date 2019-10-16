package com.example.whalemusic.model;

import java.io.Serializable;

public class Cancion implements Serializable {
    private String nombre;
    private String artista;
    private String album;
    private Integer año;

    public Cancion(String nombre, String artista, String album, Integer año) {
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }
}
