package aula2_exercicio7;
/*Uma escola deseja um sistema para calcular a média final de um aluno.

A interface deve conter:

Campo de texto para o nome do aluno
Dois campos de texto para as notas
Um botão “Calcular Média”
Um rótulo ou campo para exibir:
A média
A situação do aluno (Aprovado ou Reprovado)
Regras:

Média = (nota1 + nota2) / 2

Média ≥ 7 → Aprovado

Média < 7 → Reprovado

Ao clicar no botão, o sistema deve calcular a média e exibir o resultado junto com a situação.*/
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Escola extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtMediaResult;
	private JTextField txtSituacaoResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Escola frame = new Escola();
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
	public Escola() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(69, 29, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(125, 26, 242, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNota1 = new JLabel("Nota 1: ");
		lblNota1.setBounds(69, 66, 46, 14);
		contentPane.add(lblNota1);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(125, 63, 86, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(225, 66, 46, 14);
		contentPane.add(lblNota2);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(281, 63, 86, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		JLabel lblMedia = new JLabel("Média: ");
		lblMedia.setBounds(69, 106, 46, 14);
		contentPane.add(lblMedia);
		
		txtMediaResult = new JTextField();
		txtMediaResult.setBounds(125, 106, 86, 20);
		contentPane.add(txtMediaResult);
		txtMediaResult.setColumns(10);
		
		JLabel lblSituacao = new JLabel("Situação:");
		lblSituacao.setBounds(225, 106, 59, 14);
		contentPane.add(lblSituacao);
		
		txtSituacaoResult = new JTextField();
		txtSituacaoResult.setBounds(281, 103, 86, 20);
		contentPane.add(txtSituacaoResult);
		txtSituacaoResult.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(69, 170, 89, 23);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nota1 = txtNota1.getText();
				String nota2 = txtNota2.getText();
				
				double nota3 = Double.parseDouble(nota1);
				double nota4 = Double.parseDouble(nota2);
				
				if (nota1.isEmpty() || nota2.isEmpty()) {
					JOptionPane.showMessageDialog(
					null,
					"Preencha todos os campos.",
					"Aviso",
					JOptionPane.WARNING_MESSAGE
					);
				} try {
					double n3 = Double.parseDouble(nota1);
					double n4 = Double.parseDouble(nota2);
					
					double media = (nota3 + nota4) / 2;
					
					if (media > 10 || media < 0) {
						JOptionPane.showMessageDialog(
							null,
							"Média inválida, confira os valores.",
							"Erro",
							JOptionPane.ERROR_MESSAGE
						);
					} else { 
						txtMediaResult.setText(media + "");
						if(media >= 7) {
								txtSituacaoResult.setText("Aprovado");
							} else {
								txtSituacaoResult.setText("Reprovado");
							
								}
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
		contentPane.add(btnCalcular);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(225, 170, 89, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.add(btnFechar);

	}

}
