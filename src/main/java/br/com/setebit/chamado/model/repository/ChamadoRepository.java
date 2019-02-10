package br.com.setebit.chamado.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.setebit.chamado.model.entity.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {

}
