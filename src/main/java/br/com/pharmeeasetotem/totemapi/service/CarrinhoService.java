package br.com.pharmeeasetotem.totemapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pharmeeasetotem.totemapi.model.Carrinho;
import br.com.pharmeeasetotem.totemapi.repository.CarrinhoRepository;

@Service
public class CarrinhoService {

    @Autowired
    CarrinhoRepository carrinhoRepository;

    public Carrinho criarCarrinho() {
        return carrinhoRepository.save(new Carrinho());
    }

    public Carrinho finalizarCarrinho(Carrinho carrinho) {
        return carrinhoRepository.save(carrinho);
    }

    public void flush() {
        carrinhoRepository.flush();
    }

}
