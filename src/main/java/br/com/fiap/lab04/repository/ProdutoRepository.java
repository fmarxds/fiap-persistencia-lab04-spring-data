package br.com.fiap.lab04.repository;

import br.com.fiap.lab04.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {

    @Query("select p from ProdutoEntity p where p.nome = :nome")
    List<ProdutoEntity> findByName(@Param("nome") String nome);

}
