package com.example.whalemusic.controller;

import com.example.whalemusic.ResultListener;
import com.example.whalemusic.model.DatosDao;
import com.example.whalemusic.model.Genero;

import java.util.List;

public class GeneroController {
    public void traerGeneros(final ResultListener listenerDeLaVista){
        DatosDao datosDao =new DatosDao();
        datosDao.traerGeneros(new ResultListener<List<Genero>>() {
            @Override
            public void finish(List<Genero> result) {
                listenerDeLaVista.finish(result);
            }
        });
    }
}
