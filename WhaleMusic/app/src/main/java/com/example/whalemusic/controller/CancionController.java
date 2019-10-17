package com.example.whalemusic.controller;

import com.example.whalemusic.ResultListener;
import com.example.whalemusic.model.Cancion;
import com.example.whalemusic.model.DatosDao;

import java.util.List;

public class CancionController {
        public void traerCanciones(final ResultListener listenerDeLaVista){
            DatosDao datosDao =new DatosDao();
            datosDao.traerCanciones(new ResultListener<List<Cancion>>() {
        @Override
        public void finish(List<Cancion> result) {
            listenerDeLaVista.finish(result);
        }
    });
    }
}

