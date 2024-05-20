package br.com.pharmeeasetotem.totemapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pharmeeasetotem.totemapi.model.Remedio;
import br.com.pharmeeasetotem.totemapi.repository.RemedioRepository;

@Service
public class RemedioService {

    @Autowired
    RemedioRepository remedioRepository;

    public Remedio consultarRemedioPeloId(Long id) {
        return remedioRepository.findById(id).get();
    }
}
