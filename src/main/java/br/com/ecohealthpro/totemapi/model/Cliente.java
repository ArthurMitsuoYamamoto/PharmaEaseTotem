package br.com.ecohealthpro.totemapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    private String cpf;
    @OneToMany(mappedBy = "cliente")
    private List<Carrinho> carrinhos;

    public Cliente(String cpf) {
        this.cpf = cpf;
    }
}