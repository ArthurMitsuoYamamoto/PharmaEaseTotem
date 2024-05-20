package br.com.pharmeeasetotem.totemapi.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pedido_id")
    private Long id;
    private Integer quantidade;
    private double preco;
    @ManyToOne
    @JoinColumn(name = "carrinho_id")
    private Carrinho carrinho;
    @ManyToOne
    @JoinColumn(name = "remedio_id")
    private Remedio remedio;
}
