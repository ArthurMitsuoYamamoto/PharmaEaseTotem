package br.com.ecohealthpro.totemapi.service;

import br.com.ecohealthpro.totemapi.model.Carrinho;
import br.com.ecohealthpro.totemapi.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
