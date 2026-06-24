package aula3_RoteiroLayouts;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculadoraInvestimentos extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private JTextField txtMeses;
	private JTextField txtJuros;
	private JTextField txtDepositoMensal;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					CalculadoraInvestimentos frame = new CalculadoraInvestimentos();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/**
	 * Create the frame.
	 */
	public CalculadoraInvestimentos() {

		setTitle("CalcInvest");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 250, 250);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		// Conforme solicitado no roteiro, esta primeira versão
		// utiliza posicionamento absoluto.
		contentPane.setLayout(null);

		JLabel lblMeses = new JLabel("Meses");

		lblMeses.setBounds(20, 20, 80, 20);

		contentPane.add(lblMeses);

		txtMeses = new JTextField();

		txtMeses.setBounds(120, 20, 80, 20);

		contentPane.add(txtMeses);

		txtMeses.setColumns(10);

		JLabel lblJuros = new JLabel("Juros (%)");

		lblJuros.setBounds(20, 60, 80, 20);

		contentPane.add(lblJuros);

		txtJuros = new JTextField();

		txtJuros.setBounds(120, 60, 80, 20);

		contentPane.add(txtJuros);

		txtJuros.setColumns(10);

		JLabel lblDeposito = new JLabel("Depósito");

		lblDeposito.setBounds(20, 100, 80, 20);

		contentPane.add(lblDeposito);

		txtDepositoMensal = new JTextField();

		txtDepositoMensal.setBounds(120, 100, 80, 20);

		contentPane.add(txtDepositoMensal);

		txtDepositoMensal.setColumns(10);

		JButton btnCalcular = new JButton("Calcular");

		btnCalcular.setBounds(60, 140, 120, 25);

		contentPane.add(btnCalcular);

		JLabel lblTotal = new JLabel("Total");

		lblTotal.setBounds(20, 180, 80, 20);

		contentPane.add(lblTotal);

		txtTotal = new JTextField();

		txtTotal.setBounds(120, 180, 80, 20);

		txtTotal.setEditable(false);

		contentPane.add(txtTotal);

		txtTotal.setColumns(10);

	}

}