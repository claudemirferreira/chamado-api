package br.com.setebit.chamado.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.chamado.model.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}