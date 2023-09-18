package com.projetojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetojpa.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Métodos personalizados podem ser adicionados aqui
}
