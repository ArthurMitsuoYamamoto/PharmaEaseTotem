package br.com.ecohealthpro.totemapi.service;

import br.com.ecohealthpro.totemapi.model.Remedio;
import br.com.ecohealthpro.totemapi.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemedioService {

    @Autowired
    RemedioRepository remedioRepository;

    public Remedio consultarRemedioPeloId(Long id) {
        return remedioRepository.findById(id).get();
    }
}
