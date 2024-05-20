package br.com.ecohealthpro.totemapi.service;

import br.com.ecohealthpro.totemapi.model.Cliente;
import br.com.ecohealthpro.totemapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Optional<Cliente> verificarSeClienteExiste(String cpf) {
        return clienteRepository.findById(cpf);
    }

    public Cliente criarCliente(String cpf) {
        return clienteRepository.save(
                new Cliente(cpf)
        );
    }
}