package br.com.setebit.chamado.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.chamado.model.entity.StatusChamado;

public interface StatusChamadoRepository extends JpaRepository<StatusChamado, Long> {

}