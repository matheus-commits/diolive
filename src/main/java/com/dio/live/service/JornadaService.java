package com.dio.live.service;

import com.dio.live.model.JornadaTrabalho;

import java.util.List;
import java.util.Optional;

public interface JornadaService {

    JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho);

    List<JornadaTrabalho> findAll();

    Optional<JornadaTrabalho> getById(Long idJornada);

    JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho);

    void deleteJornada(Long idJornada);
}
