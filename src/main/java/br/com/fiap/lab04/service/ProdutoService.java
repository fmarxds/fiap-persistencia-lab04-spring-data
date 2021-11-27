package br.com.fiap.lab04.service;

import br.com.fiap.lab04.entity.ProdutoEntity;
import br.com.fiap.lab04.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Transactional
    public void add(ProdutoEntity produto) {
        produtoRepository.save(produto);
    }

    @Transactional
    public List<ProdutoEntity> findAll() {
        return produtoRepository.findAll();
    }

    @Transactional
    public void addAll(Collection<ProdutoEntity> produtos) {
        for (ProdutoEntity produto : produtos) {
            produtoRepository.save(produto);
        }
    }

    @Transactional
    public List<ProdutoEntity> findByName(String nome) {
        return produtoRepository.findByName(nome);
    }

}
