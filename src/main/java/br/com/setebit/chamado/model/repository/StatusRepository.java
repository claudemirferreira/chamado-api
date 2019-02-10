package br.com.setebit.chamado.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.chamado.model.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
