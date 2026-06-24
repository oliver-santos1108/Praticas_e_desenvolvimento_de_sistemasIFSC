package atividade1_aula1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(236, 214, 89, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnFechar);
		
		JLabel lblNewLabel = new JLabel("Olá!");
		lblNewLabel.setBounds(168, 11, 131, 47);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("DejaVu Sans Mono", Font.PLAIN, 20));
		lblNome.setBounds(30, 125, 66, 18);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(106, 127, 256, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnAvancar = new JButton("Avançar");
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				JOptionPane.showMessageDialog(null,"Seja bem vindo " + nome + "!");
			}
		});
		btnAvancar.setBounds(98, 214, 89, 23);
		contentPane.add(btnAvancar);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("DejaVu Sans Mono", Font.PLAIN, 20));
		lblCPF.setBounds(30, 169, 58, 17);
		contentPane.add(lblCPF);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(106, 170, 256, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Realize seu cadastro:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(30, 69, 256, 40);
		contentPane.add(lblNewLabel_1);

	}
}
