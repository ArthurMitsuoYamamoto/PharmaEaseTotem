package br.com.pharmeeasetotem.totemapi.record;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record FinalizarCarrinhoRequestRecord(
        @NotBlank
        String cpf,
        @NotBlank
        List<PedidoRecord> pedidos
) { }