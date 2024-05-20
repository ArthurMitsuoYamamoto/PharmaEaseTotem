package br.com.pharmeeasetotem.totemapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pharmeeasetotem.totemapi.model.Pedido;
import br.com.pharmeeasetotem.totemapi.repository.PedidoRepository;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public void salvarPedidos(List<Pedido> pedidos) {
        pedidoRepository.saveAll(pedidos);
    }


}
