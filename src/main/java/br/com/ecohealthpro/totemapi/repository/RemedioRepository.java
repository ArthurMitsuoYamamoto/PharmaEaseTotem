package br.com.ecohealthpro.totemapi.repository;

import br.com.ecohealthpro.totemapi.model.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemedioRepository extends JpaRepository<Remedio, Long> { }