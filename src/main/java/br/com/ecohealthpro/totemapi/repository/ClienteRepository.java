package br.com.ecohealthpro.totemapi.repository;

import br.com.ecohealthpro.totemapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> { }