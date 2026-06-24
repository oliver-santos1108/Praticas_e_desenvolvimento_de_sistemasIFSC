package aula6e7_JComboBox;

public enum TempoDuracao {
	MENSAL ("Mensal",0),
	SEMESTRAL("Semestral",0.1),
	ANUAL("Anual",0.2);
	
	String descricao;
	double valor;
	
	private TempoDuracao(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String toString() {
		return descricao;
	}
}
