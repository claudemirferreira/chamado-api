package br.com.setebit.chamado.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CHA_STATUS_CHAMADO")
@Getter
@Setter
public class StatusChamado implements Serializable {

	private static final long serialVersionUID = -231799589365921070L;

	@Id
	@Column(name = "ID_STATUS_CHAMADO", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_STAT_CHAM_SEQ")
	@SequenceGenerator(sequenceName = "ID_STAT_CHAM_SEQ", allocationSize = 1, name = "ID_STAT_CHAM_SEQ")
	private Long id;

	@Column(nullable = false, length = 100)
	private String observacao;

	@Column(nullable = false, name = "INICIO")
	private Date inicio;

	@Column(name = "FIM")
	private Date fim;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_CHAMADO", nullable = false)
	@ForeignKey(name = "FK_STATUS_ID_CHAMADO")
	private Chamado chamado;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_STATUS", nullable = false)
	@ForeignKey(name = "FK_STATUS_ID_STATUS")
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
		StatusChamado other = (StatusChamado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}