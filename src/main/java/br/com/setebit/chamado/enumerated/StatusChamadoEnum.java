package br.com.setebit.chamado.enumerated;

public enum StatusChamadoEnum {

	CADASTRADO(0, "CADASTRADO"), ATRIBUIDO(1, "ATRIBUIDO"), PENDENTE(2, "PENDENTE"), CONCLUIDO(3, "CONCLUIDO"),
	FECHADO(4, "FECHADO"), CANCELADO(5, "CANCELADO");

	private final Integer codigo;
	
	private final String descricao;

	StatusChamadoEnum(final Integer codigo, final String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public static StatusChamadoEnum valueOfCodigo(final String codigo) {
		for (StatusChamadoEnum status : StatusChamadoEnum.values()) {
			if (status.getCodigo().equals(codigo)) {
				return status;
			}
		}
		return null;
	}

	public static Integer valueOfEnumm(final StatusChamadoEnum enumm) {
		for (StatusChamadoEnum status : StatusChamadoEnum.values()) {
			if (status.equals(enumm)) {
				return status.getCodigo();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return codigo + " - " + descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}