package br.com.setebit.chamado.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.setebit.chamado.model.entity.Produto;
import br.com.setebit.chamado.model.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	public Produto save(Produto entity) {
		repository.save(entity);
		return entity;
	}

	public void delete(Produto entity) {
		repository.delete(entity);
	}

	public Optional<Produto> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Produto> findAll() {
		List<Produto> list = repository.findAll();
		System.out.println(list.size());
		return list;
	}

}