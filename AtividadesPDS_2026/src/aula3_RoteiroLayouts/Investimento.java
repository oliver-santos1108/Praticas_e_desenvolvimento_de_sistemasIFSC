package aula3_RoteiroLayouts;
public class Investimento {

	private int meses;
	private double juros;
	private double depositoMensal;

	public Investimento(int meses, double juros, double depositoMensal) {

		this.meses = meses;
		this.juros = juros / 100;
		this.depositoMensal = depositoMensal;

	}

	public double calculaTotal() {

		int numeroPagamentos = meses;

		double total = 0;

		for (int i = 0; i < numeroPagamentos; i++) {

			total = total + depositoMensal;

			total = total + total * juros;

		}

		return total;

	}

}