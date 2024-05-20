package br.com.pharmeeasetotem.totemapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pharmeeasetotem.totemapi.model.Cliente;
import br.com.pharmeeasetotem.totemapi.repository.ClienteRepository;

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