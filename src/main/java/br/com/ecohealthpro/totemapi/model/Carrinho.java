package br.com.ecohealthpro.totemapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Carrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy = "carrinho")
    private List<Pedido> pedidos;
    private double precoTotal;
    @ManyToOne
    @JoinColumn(name = "cliente_cpf")
    private Cliente cliente;
}
