package aula2_exercicio5;
/*5) O restaurante a quilo “Fomelândia” cobra R$9,95 por cada quilo de refeição.
 *  Escreva um programa com dois componentes de texto referente ao peso do prato montado pelo cliente (em quilos) e o valor do quilo. 
 * Ao clicar no botão “Calcular”, o sistema irá mostrar o valor total a pagar. 
 * Assuma que a balança já desconte o peso do prato*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Fomelandia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrecoKg;
	private JTextField txtPrecoPrato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fomelandia frame = new Fomelandia();
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
	public Fomelandia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFomelandia = new JLabel("Fomelândia");
		lblFomelandia.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		lblFomelandia.setHorizontalAlignment(SwingConstants.CENTER);
		lblFomelandia.setBounds(44, 23, 356, 14);
		contentPane.add(lblFomelandia);
		
		JLabel lblPrecoKg = new JLabel("Preço por kg (R$):");
		lblPrecoKg.setBounds(62, 63, 161, 14);
		contentPane.add(lblPrecoKg);
		
		JLabel lblPrecoPrato = new JLabel("Peso do prato (kg): ");
		lblPrecoPrato.setBounds(62, 112, 142, 14);
		contentPane.add(lblPrecoPrato);
		
		txtPrecoKg = new JTextField();
		txtPrecoKg.setBounds(223, 60, 122, 20);
		contentPane.add(txtPrecoKg);
		txtPrecoKg.setColumns(10);
		
		txtPrecoPrato = new JTextField();
		txtPrecoPrato.setBounds(223, 109, 122, 20);
		contentPane.add(txtPrecoPrato);
		txtPrecoPrato.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total a pagar (R$): ");
		lblTotal.setBounds(62, 159, 142, 14);
		contentPane.add(lblTotal);
		
		JLabel lblResult = new JLabel("");
		lblResult.setBounds(223, 159, 122, 14);
		contentPane.add(lblResult);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(223, 211, 89, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnFechar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(86, 211, 89, 23);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String precoKg = txtPrecoKg.getText();
				String precoPrato = txtPrecoPrato.getText();
				
				double precoKg1 = Double.parseDouble(precoKg);
				double precoPrato1 = Double.parseDouble(precoPrato);
				
				double total = precoKg1 * precoPrato1;
				
				lblResult.setText(total + "");
			}
		});
		contentPane.add(btnCalcular);

	}

}
