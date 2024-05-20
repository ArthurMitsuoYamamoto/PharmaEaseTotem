package br.com.ecohealthpro.totemapi.controller;

import br.com.ecohealthpro.totemapi.model.Carrinho;
import br.com.ecohealthpro.totemapi.model.Cliente;
import br.com.ecohealthpro.totemapi.model.Pedido;
import br.com.ecohealthpro.totemapi.model.Remedio;
import br.com.ecohealthpro.totemapi.record.FinalizarCarrinhoRequestRecord;
import br.com.ecohealthpro.totemapi.service.CarrinhoService;
import br.com.ecohealthpro.totemapi.service.ClienteService;
import br.com.ecohealthpro.totemapi.service.PedidoService;
import br.com.ecohealthpro.totemapi.service.RemedioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    CarrinhoService carrinhoService;

    @Autowired
    ClienteService clienteService;

    @Autowired
    RemedioService remedioService;

    @Autowired
    PedidoService pedidoService;

    @PostMapping("/finalizar-carrinho")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> finalizarCarrinho(
            @Valid @RequestBody FinalizarCarrinhoRequestRecord requestBody
    ) {
        Carrinho carrinho = carrinhoService.criarCarrinho();
        final double[] valorTotalCarrinho = {0.0d};

        Optional<Cliente> cliente = clienteService.verificarSeClienteExiste(requestBody.cpf());

        if(cliente.isEmpty()) {
            carrinho.setCliente(clienteService.criarCliente(requestBody.cpf()));
        } else {
            carrinho.setCliente(cliente.get());
        }

       List<Pedido> pedidos = requestBody
                .pedidos()
                .stream()
                .map((pedido) -> {
                    Remedio remedio = remedioService.consultarRemedioPeloId(pedido.remedioId());
                    double valorTotalPedido = remedio.getPreco() * pedido.quantidade();
                    valorTotalCarrinho[0] += valorTotalPedido;
                    return Pedido.builder()
                            .carrinho(carrinho)
                            .remedio(remedio)
                            .quantidade(pedido.quantidade())
                            .preco(valorTotalPedido)
                            .build();
                })
                .toList();

        pedidoService.salvarPedidos(pedidos);
        carrinho.setPrecoTotal(valorTotalCarrinho[0]);
        Carrinho carrinhoSalvo = carrinhoService.finalizarCarrinho(carrinho);

        return ResponseEntity.ok().body("{ 'senha': '" + carrinhoSalvo.getId() + "'}");
    }

}
