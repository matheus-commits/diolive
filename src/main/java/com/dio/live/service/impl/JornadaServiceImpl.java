package com.dio.live.service.impl;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepository;
import com.dio.live.service.JornadaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class JornadaServiceImpl implements JornadaService {

    JornadaRepository jornadaRepository;

    @Override
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
       return jornadaRepository.save(jornadaTrabalho);

    }

    @Override
    public List<JornadaTrabalho> findAll() {
       return   jornadaRepository.findAll();
    }

    @Override
    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    @Override
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    @Override
    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}
