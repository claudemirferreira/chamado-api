package br.com.setebit.chamado.service;

import java.util.List;
import java.util.Optional;

import br.com.setebit.chamado.model.entity.Status;

public interface StatusService {

	public Status save(Status entity);

	public void delete(Status entity);

	public Optional<Status> findById(Long id);

	public List<Status> findAll();

}
