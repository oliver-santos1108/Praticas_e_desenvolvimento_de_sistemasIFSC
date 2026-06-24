package aula5_RadioJButton;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class ClienteAcademia extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteAcademia frame = new ClienteAcademia();
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
	public ClienteAcademia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow][][][][]", "[][][][][][][][]"));
		
		JLabel lblCadastrodeCliente = new JLabel("Cadastro de Cliente - Academia TREINO FIT");
		lblCadastrodeCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblCadastrodeCliente, "cell 3 0");
		
		JLabel lblNome = new JLabel("Nome:");
		contentPane.add(lblNome, "cell 2 1,alignx trailing");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 3 1,growx");
		textField.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		contentPane.add(lblTelefone, "cell 2 2,alignx trailing");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 3 2,growx");
		textField_1.setColumns(10);
		
		JLabel lblTipoDePlano = new JLabel("Tipo de Plano:");
		contentPane.add(lblTipoDePlano, "cell 2 3,alignx trailing");
		
		JRadioButton btnPlanoBasico = new JRadioButton("Básico");
		contentPane.add(btnPlanoBasico, "flowx,cell 3 3");
		
		JLabel lblDuracao = new JLabel("Duração:");
		contentPane.add(lblDuracao, "cell 2 4,alignx right");
		
		JRadioButton btnPlanoIntermediario = new JRadioButton("Intermediário");
		contentPane.add(btnPlanoIntermediario, "cell 3 3");
		
		JRadioButton btnPlanoPremium = new JRadioButton("Premium");
		contentPane.add(btnPlanoPremium, "cell 3 3");
		
		JRadioButton btnDuracaoMensal = new JRadioButton("Mensal");
		contentPane.add(btnDuracaoMensal, "flowx,cell 3 4");
		
		JRadioButton btnDuracaoSemestral = new JRadioButton("Semestral");
		contentPane.add(btnDuracaoSemestral, "cell 3 4");
		
		JRadioButton btnDuracaoAnual = new JRadioButton("Anual");
		contentPane.add(btnDuracaoAnual, "cell 3 4");
		
		JLabel lblFrequencia = new JLabel("Frequência semanal:");
		contentPane.add(lblFrequencia, "cell 2 5");
		
		JRadioButton btn2x = new JRadioButton("2x por semana ");
		contentPane.add(btn2x, "flowx,cell 3 5");
		
		JRadioButton btn3x = new JRadioButton("3x por semana");
		contentPane.add(btn3x, "cell 3 5");
		
		JRadioButton btn5x = new JRadioButton("5x por semana");
		contentPane.add(btn5x, "cell 3 5");
		
		JButton btnCalcular = new JButton("Calcular");
		contentPane.add(btnCalcular, "cell 2 7,growx");

       
		
		JLabel lblValorFinal = new JLabel("Valor final:");
		contentPane.add(lblValorFinal, "flowx,cell 3 7");
		
		JLabel lblResult = new JLabel("");
		contentPane.add(lblResult, "cell 3 7");

	}

}
