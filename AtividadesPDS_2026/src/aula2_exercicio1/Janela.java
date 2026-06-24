package aula2_exercicio1;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNome;
	private JLabel lblMensagem;
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
		contentPane.setBackground(new Color(253, 174, 121));
		contentPane.setForeground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnFechar.setForeground(new Color(255, 255, 255));
		btnFechar.setBackground(new Color(255, 128, 0));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(170, 207, 89, 23);
		contentPane.add(btnFechar);
		
		JLabel lblLupa = new JLabel("");
		lblLupa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nome = txtNome.getText();
				lblMensagem.setText(nome + " não foi possível realizar a busca.");
			}
		});
		lblLupa.setIcon(new ImageIcon(Janela.class.getResource("/img/lupa (1).png")));
		lblLupa.setBounds(333, 11, 58, 79);
		contentPane.add(lblLupa);
		
		textField = new JTextField();
		textField.setBounds(77, 45, 246, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblMensagem = new JLabel("");
		lblMensagem.setBounds(77, 174, 299, 14);
		contentPane.add(lblMensagem);
		
		txtNome = new JTextField();
		txtNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				String nome = txtNome.getText();
				lblMensagem.setText(nome + " não foi possível realizar a busca.");
			}}
			
		});
		txtNome.setBounds(77, 104, 101, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(77, 89, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setBounds(77, 30, 46, 14);
		contentPane.add(lblBuscar);

	}
}
