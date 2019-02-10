package br.com.setebit.chamado.model.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CHA_CHAMADO")
@Getter
@Setter
public class Chamado implements Serializable {

	private static final long serialVersionUID = -231799589365921070L;

	@Id
	@Column(name = "ID_CHAMADO", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_CHAMADO_SEQ")
	@SequenceGenerator(sequenceName = "ID_CHAMADO_SEQ", allocationSize = 1, name = "ID_CHAMADO_SEQ")
	private Long id;

	@Column(nullable = false, length = 60)
	private String descricao;

	@Column(name = "DATA_INICIO", nullable = false)
	private Date dataInicio;

	@Column(name = "DATA_FIM")
	private Date dataFim;

	@Column(length = 255)
	private String observacao;

	@OneToMany(mappedBy = "chamado", cascade = CascadeType.ALL)
	private Collection<StatusChamado> statusChamados;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_STATUS", nullable = false)
	@ForeignKey(name = "FK_CHAMADO_ID_STATUS")
	private Status status;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamado other = (Chamado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}