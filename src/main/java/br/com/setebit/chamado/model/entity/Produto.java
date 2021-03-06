package br.com.setebit.chamado.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CHA_PRODUTO")
@Getter
@Setter
public class Produto implements Serializable {

	private static final long serialVersionUID = -231799589365921070L;

	@Id
	@Column(name = "ID_PRODUTO", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_PRODUTO_SEQ")
	@SequenceGenerator(sequenceName = "ID_PRODUTO_SEQ", allocationSize = 1, name = "ID_PRODUTO_SEQ")
	@Getter
	@Setter
	private Long id;

	@Column(nullable = false, length = 30)
	@Getter
	@Setter	
	private String nome;

	@Column(nullable = false)
	@Getter
	@Setter
	private String descricao;

	@Column(nullable = false)
	@Getter
	@Setter
	private BigDecimal valor;

	@Column(nullable = false)
	@Getter
	@Setter
	private Date data;

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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}