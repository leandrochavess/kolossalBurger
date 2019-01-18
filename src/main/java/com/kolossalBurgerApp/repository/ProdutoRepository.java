package com.kolossalBurgerApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kolossalBurgerApp.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
