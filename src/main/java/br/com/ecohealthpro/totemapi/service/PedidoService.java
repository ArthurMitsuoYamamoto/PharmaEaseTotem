package br.com.ecohealthpro.totemapi.service;

import br.com.ecohealthpro.totemapi.model.Pedido;
import br.com.ecohealthpro.totemapi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public void salvarPedidos(List<Pedido> pedidos) {
        pedidoRepository.saveAll(pedidos);
    }


}
