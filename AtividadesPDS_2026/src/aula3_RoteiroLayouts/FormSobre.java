package aula3_RoteiroLayouts;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FormSobre extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					FormSobre frame = new FormSobre();

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
	public FormSobre() {

		setTitle("CalcInvest");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setBounds(100, 100, 350, 220);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

		setContentPane(contentPane);

		contentPane.setLayout(new GridLayout(5, 1, 0, 5));

		JLabel lblTitulo = new JLabel("CalcInvest - Calculadora de Investimentos");

		contentPane.add(lblTitulo);

		JLabel lblVersao = new JLabel("Versão: 1.0");

		contentPane.add(lblVersao);

		JLabel lblAutor = new JLabel("Autor: Oliver Santos");

		contentPane.add(lblAutor);

		JLabel lblContato = new JLabel("Contato: oliver.cs11@aluno.ifsc.edu.br");

		contentPane.add(lblContato);

		JPanel painel = new JPanel();

		painel.setLayout(new FlowLayout());

		contentPane.add(painel);

		JButton btnOk = new JButton("OK");

		btnOk.addActionListener(e -> dispose());

		painel.add(btnOk);

	}

}