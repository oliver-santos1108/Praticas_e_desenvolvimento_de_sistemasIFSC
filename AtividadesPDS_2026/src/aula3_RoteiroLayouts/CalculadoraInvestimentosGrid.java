package aula3_RoteiroLayouts;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraInvestimentosGrid extends JFrame {

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

					CalculadoraInvestimentosGrid frame = new CalculadoraInvestimentosGrid();

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
	public CalculadoraInvestimentosGrid() {

		setTitle("CalcInvest");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 350, 250);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

		setContentPane(contentPane);

		contentPane.setLayout(new BorderLayout());

		// Menu

		JMenuBar menuBar = new JMenuBar();

		setJMenuBar(menuBar);

		JMenu mnAjuda = new JMenu("Ajuda");

		menuBar.add(mnAjuda);

		JMenuItem mntmSobre = new JMenuItem("Sobre");

		mnAjuda.add(mntmSobre);

		// Painel principal

		JPanel painelCentro = new JPanel();

		painelCentro.setLayout(new GridLayout(4, 2, 5, 5));

		contentPane.add(painelCentro, BorderLayout.CENTER);

		painelCentro.add(new JLabel("Meses"));

		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		txtMeses = new JTextField(12);

		p1.add(txtMeses);

		painelCentro.add(p1);

		painelCentro.add(new JLabel("Juros (%)"));

		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		txtJuros = new JTextField(12);

		p2.add(txtJuros);

		painelCentro.add(p2);

		painelCentro.add(new JLabel("Depósito Mensal"));

		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		txtDepositoMensal = new JTextField(12);

		p3.add(txtDepositoMensal);

		painelCentro.add(p3);

		painelCentro.add(new JLabel("Total"));

		JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		txtTotal = new JTextField(12);

		txtTotal.setEditable(false);

		p4.add(txtTotal);

		painelCentro.add(p4);

		// Botão

		JPanel painelSul = new JPanel();

		JButton btnCalcular = new JButton("Calcular");

		painelSul.add(btnCalcular);

		contentPane.add(painelSul, BorderLayout.SOUTH);

		// Evento do botão calcular

		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					int meses = Integer.parseInt(txtMeses.getText());

					double juros = Double.parseDouble(txtJuros.getText());

					double deposito = Double.parseDouble(txtDepositoMensal.getText());

					Investimento investimento = new Investimento(meses, juros, deposito);

					double total = investimento.calculaTotal();

					txtTotal.setText(String.format("%.2f", total));

				} catch (NumberFormatException ex) {

					JOptionPane.showMessageDialog(null,
							"Digite somente números válidos.");

				}

			}

		});

		// Evento do menu Sobre

		mntmSobre.addActionListener(e -> {

			FormSobre tela = new FormSobre();

			tela.setVisible(true);

		});

	}

}