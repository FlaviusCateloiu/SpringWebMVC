package com.example.springwebmvc.servicios;

import com.example.springwebmvc.modelos.Piloto;

import java.util.List;

public interface PilotoServicio {
    List<Piloto> findAllPilotos();
    Piloto findPiloto(String id);
    Piloto createPiloto(Piloto piloto);
    Piloto updatePiloto(Piloto piloto);
    void deletePiloto(String id);
}
