package aula6e7_JComboBox;

public enum TipoPlano {
	BASICO ("Básico", 80),
	INTERMEDIARIO ("Intermedário",120),
	PREMIUM("Premium",180);
	
	String descricao;
	double valor;
	
	private TipoPlano(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String toString() {
		return descricao;
	}
}
