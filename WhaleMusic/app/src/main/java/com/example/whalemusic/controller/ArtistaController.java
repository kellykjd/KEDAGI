package com.example.whalemusic.controller;

import com.example.whalemusic.ResultListener;
import com.example.whalemusic.model.Artista;
import com.example.whalemusic.model.DatosDao;

import java.util.List;

public class ArtistaController {
    public void traerArtistas(final ResultListener listenerDeLaVista){
    DatosDao datosDao =new DatosDao();
    datosDao.traerArtistas(new ResultListener<List<Artista>>() {
        @Override
        public void finish(List<Artista> result) {
            listenerDeLaVista.finish(result);
        }
    });
    }
}
