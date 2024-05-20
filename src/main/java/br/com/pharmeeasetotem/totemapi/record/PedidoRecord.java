package br.com.pharmeeasetotem.totemapi.record;

import jakarta.validation.constraints.NotBlank;

public record PedidoRecord (
        @NotBlank
        Long remedioId,
        @NotBlank
        int quantidade
) { }
