package aula2_exercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JLabel lblMensagem;
	
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

	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 174, 121));
		contentPane.setForeground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(234, 209, 89, 23);
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFechar.setForeground(new Color(247, 9, 164));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnFechar);
		
		JLabel lblLupa = new JLabel("");
		lblLupa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nome = txtSobrenome.getText();
				lblMensagem.setText(nome + " não foi possível realizar a busca.");
			}
		});
		
		txtNome = new JTextField();
		txtNome.setBounds(77, 45, 246, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		lblMensagem = new JLabel("");
		lblMensagem.setBounds(77, 174, 299, 14);
		contentPane.add(lblMensagem);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(77, 104, 246, 20);
		
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(77, 30, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(77, 91, 170, 14);
		contentPane.add(lblSobrenome);
		
		JLabel lblNomeCompleto = new JLabel("");
		lblNomeCompleto.setBounds(77, 156, 246, 32);
		contentPane.add(lblNomeCompleto);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setForeground(new Color(209, 41, 151));
		btnEnter.setBounds(98, 209, 89, 23);
		contentPane.add(btnEnter);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sobrenome = txtSobrenome.getText();
				String nome = txtNome.getText();
				lblNomeCompleto.setText("Olá "+ nome + " " + sobrenome + "!");
			}
		});
}
}

