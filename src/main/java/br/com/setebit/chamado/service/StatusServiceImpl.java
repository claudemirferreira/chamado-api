package br.com.setebit.chamado.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.setebit.chamado.model.entity.Status;
import br.com.setebit.chamado.model.repository.StatusRepository;

@Service
public class StatusServiceImpl implements StatusService {

	@Autowired
	private StatusRepository repository;

	public Status save(Status entity) {
		repository.save(entity);
		return entity;
	}

	public void delete(Status entity) {
		repository.delete(entity);
	}

	public Optional<Status> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public List<Status> findAll() {
		List<Status> list = repository.findAll();
		System.out.println(list.size());
		return list;
	}

}