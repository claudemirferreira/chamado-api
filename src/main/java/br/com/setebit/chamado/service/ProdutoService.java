package br.com.setebit.chamado.service;

import java.util.List;
import java.util.Optional;

import br.com.setebit.chamado.model.entity.Produto;

public interface ProdutoService {

	public Produto save(Produto entity);

	public void delete(Produto entity);

	public Optional<Produto> findById(Long id);

	public List<Produto> findAll();

}