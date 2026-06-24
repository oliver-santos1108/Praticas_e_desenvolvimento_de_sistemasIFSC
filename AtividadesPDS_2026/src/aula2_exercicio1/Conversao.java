package aula2_exercicio1;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField lblTemperaturaCelsius;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversao frame = new Conversao();
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
	public Conversao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTemperatura = new JLabel("Temperatura (°C): ");
		lblTemperatura.setBounds(39, 48, 104, 14);
		contentPane.add(lblTemperatura);
		
		lblTemperaturaCelsius = new JTextField();
		lblTemperaturaCelsius.setBounds(136, 45, 202, 20);
		contentPane.add(lblTemperaturaCelsius);
		lblTemperaturaCelsius.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(116, 146, 137, 14);
		contentPane.add(lblResultado);
		
		JButton bntConverter = new JButton("Converter");
		bntConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp = lblTemperaturaCelsius.getText();
				
				double tempD = Double.parseDouble(temp);
				
				double C = (tempD - 32) * 5.0/9.0;
				
				String TempResultado = String.valueOf(C);
				lblResultado.setText(TempResultado);
			}
		});
		bntConverter.setBounds(62, 191, 104, 31);
		contentPane.add(bntConverter);
		
		JButton bntFechar = new JButton("Fechar");
		bntFechar.setBounds(207, 191, 89, 31);
		contentPane.add(bntFechar);
		
		JLabel lblNewLabel = new JLabel("Temp (°F)");
		lblNewLabel.setBounds(39, 146, 67, 14);
		contentPane.add(lblNewLabel);
		
		
		
	}

}
