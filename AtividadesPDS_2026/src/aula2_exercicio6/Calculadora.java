package aula2_exercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
/*Desenvolva uma calculadora básica utilizando Java Swing.

A interface deve conter:

Dois campos de texto para entrada dos números
Quatro botões: Somar, Subtrair, Multiplicar e Dividir
Um campo de texto (ou JLabel) para exibir o resultado
Ao clicar em cada botão, o sistema deve realizar a operação correspondente e mostrar o resultado.

Regras:

Validar se os campos estão preenchidos
Tratar possível erro de divisão por zero
Exibir mensagem de erro utilizando JOptionPane quando necessário*/
public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		lblCalculadora.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		lblCalculadora.setHorizontalAlignment(SwingConstants.CENTER);
		lblCalculadora.setBounds(10, 11, 414, 14);
		contentPane.add(lblCalculadora);
		
		JLabel lblResult = new JLabel("");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(103, 175, 226, 14);
		contentPane.add(lblResult);
		
		JLabel lblInsira = new JLabel("Insira os números e selecione a ação:");
		lblInsira.setBounds(31, 36, 361, 14);
		contentPane.add(lblInsira);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(87, 61, 105, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(240, 61, 105, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		JButton btnSomar = new JButton("Somar");
		btnSomar.setBounds(87, 92, 105, 23);

		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txtNumero1.getText();
				String n2 = txtNumero2.getText();

				if (n1.isEmpty() || n2.isEmpty()) {
					JOptionPane.showMessageDialog(
					null,
					"Preencha todos os campos.",
					"Aviso",
					JOptionPane.WARNING_MESSAGE
					);
				}
				try {
					double n3 = Double.parseDouble(n1);
					double n4 = Double.parseDouble(n2);
					double soma = n3 + n4;
					lblResult.setText(n3 + " + " + n4 + " = " + soma);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(
						null,
						"Digite apenas números válidos.",
						"Erro",
						JOptionPane.ERROR_MESSAGE
				);
			}
			}
		});

		contentPane.add(btnSomar);
		
		
		JButton btnSubtrair = new JButton("Subtrair");
		btnSubtrair.setBounds(87, 126, 105, 23);
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txtNumero1.getText();
				String n2 = txtNumero2.getText();
				if (n1.isEmpty() || n2.isEmpty()) {
					JOptionPane.showMessageDialog(
					null,
					"Preencha todos os campos.",
					"Aviso",
					JOptionPane.WARNING_MESSAGE
					);
				}
				try {
					double n3 = Double.parseDouble(n1);
					double n4 = Double.parseDouble(n2);
					double diferenca = n3 - n4;
					lblResult.setText(n3 + " - " + n4 + " = " + diferenca);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(
						null,
						"Digite apenas números válidos.",
						"Erro",
						JOptionPane.ERROR_MESSAGE
				);
			}
			}
		});
		
		contentPane.add(btnSubtrair);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.setBounds(240, 92, 105, 23);
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txtNumero1.getText();
				String n2 = txtNumero2.getText();
				if (n1.isEmpty() || n2.isEmpty()) {
					JOptionPane.showMessageDialog(
					null,
					"Preencha todos os campos.",
					"Aviso",
					JOptionPane.WARNING_MESSAGE
					);
				}
				try {
					double n3 = Double.parseDouble(n1);
					double n4 = Double.parseDouble(n2);
					double produto = n3 * n4;
					lblResult.setText(n3 + " * " + n4 + " = " + produto);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(
						null,
						"Digite apenas números válidos.",
						"Erro",
						JOptionPane.ERROR_MESSAGE
				);
			}
			}
		});
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("Dividir");
		btnDividir.setBounds(240, 126, 105, 23);
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = txtNumero1.getText();
				String n2 = txtNumero2.getText();
				
				if (n1.isEmpty() || n2.isEmpty()) {
					JOptionPane.showMessageDialog(
					null,
					"Preencha todos os campos.",
					"Aviso",
					JOptionPane.WARNING_MESSAGE
					);
				} try {
					double n3 = Double.parseDouble(n1);
					double n4 = Double.parseDouble(n2);
					
					if (n4 == 0) {
						JOptionPane.showMessageDialog(
							null,
							"Não é possível dividir por zero.",
							"Erro",
							JOptionPane.ERROR_MESSAGE
						);
					} else { 
					double quociente = n3 / n4;
					lblResult.setText(n3 + " / " + n4 + " = " + quociente);
					}
				}catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(
						null,
						"Digite apenas números válidos.",
						"Erro",
						JOptionPane.ERROR_MESSAGE
				);
			}
			}
		});
		contentPane.add(btnDividir);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(173, 200, 89, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnFechar);

	}

}
