package aula2_exercicio4;
/*4) Um motorista deseja abastecer seu veículo com X reais de gasolina e gostaria de saber quantos litros de gasolina será será possível colocar 
 * no tanque de combustível.
 *  Crie um programa que lê o preço do litro da gasolina e o valor final do pagamento usando a biblioteca gráfica Swing. 
 *  Em seguida, apresente a quantidade em litros de gasolina é possível colocar no tanque.*/
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Gasolina extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCombustivel;
	private JTextField txtTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gasolina frame = new Gasolina();
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
	public Gasolina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCombustivel = new JTextField();
		txtCombustivel.setBounds(212, 62, 146, 20);
		contentPane.add(txtCombustivel);
		txtCombustivel.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(213, 111, 146, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JLabel lblPostoIpiranga = new JLabel("Posto Ipiranga");
		lblPostoIpiranga.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostoIpiranga.setFont(new Font("Leelawadee UI", Font.BOLD, 18));
		lblPostoIpiranga.setBounds(25, 11, 333, 40);
		contentPane.add(lblPostoIpiranga);
		
		JLabel lblCombustivel = new JLabel("Preço do combustível (R$ / L):");
		lblCombustivel.setBounds(31, 65, 171, 14);
		contentPane.add(lblCombustivel);
		
		JLabel lblTotal = new JLabel("Total (R$):");
		lblTotal.setBounds(34, 114, 131, 14);
		contentPane.add(lblTotal);
		
		JLabel lblResult = new JLabel("");
		lblResult.setBounds(212, 159, 146, 14);
		contentPane.add(lblResult);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(269, 200, 89, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnFechar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(75, 200, 89, 23);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pCombustivel = txtCombustivel.getText();
				String pTotal = txtTotal.getText();
				
				double pCombustivel1 = Double.parseDouble(pCombustivel);
				double pTotal1 = Double.parseDouble(pTotal);
				
				double result =  pTotal1 / pCombustivel1;
				
				lblResult.setText(result + "");
				
			}
		});
		contentPane.add(btnCalcular);
		
		JLabel lblTotalCombustivel = new JLabel("Total de Combustivel (L): ");
		lblTotalCombustivel.setBounds(31, 159, 184, 14);
		contentPane.add(lblTotalCombustivel);

	}

}
