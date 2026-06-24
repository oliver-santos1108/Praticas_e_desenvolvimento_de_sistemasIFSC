package aula6e7_JComboBox;

public enum TempoFrequencia {
	DUAS_VEZES_POR_SEMANA("2x por semana",0),
	TRES_VEZES_POR_SEMANA("3x por semana",0.2),
	CINCO_VEZES_POR_SEMANA("5x por semana",0.5);
	
	String descricao;
	double valor;
	
	private TempoFrequencia(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String toString() {
		return descricao;
	}
	
}
