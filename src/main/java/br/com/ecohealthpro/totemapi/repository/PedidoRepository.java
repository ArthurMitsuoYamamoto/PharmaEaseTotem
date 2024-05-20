package br.com.ecohealthpro.totemapi.repository;

import br.com.ecohealthpro.totemapi.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> { }