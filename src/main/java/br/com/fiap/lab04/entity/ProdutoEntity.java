package br.com.fiap.lab04.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProdutoEntity {

    @Id
    public Integer id;
    public String nome;

    public ProdutoEntity() {
    }

    public ProdutoEntity(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto (id: " + id + ", nome: " + nome + ")";
    }

}
