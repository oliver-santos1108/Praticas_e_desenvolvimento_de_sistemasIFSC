package aula6e7_JComboBox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JComboBox<TipoPlano> plano;
	private JComboBox<TempoDuracao> duracao;
	private JComboBox<TempoFrequencia> frequencia;

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
		setBounds(100, 100, 560, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][grow]", "[][][][][][][][]"));
		
		JLabel lblTitulo = new JLabel("Cadastro de Cliente - Academia TREINO FIT");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblTitulo, "cell 2 0,alignx center");
		
		JLabel lblNome = new JLabel("Nome:");
		contentPane.add(lblNome, "cell 0 1,alignx trailing");
		
		txtNome = new JTextField();
		contentPane.add(txtNome, "cell 1 1 4 1,growx");
		txtNome.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		contentPane.add(lblTelefone, "cell 0 2,alignx trailing");
		
		txtTelefone = new JTextField();
		contentPane.add(txtTelefone, "cell 1 2 4 1,growx");
		txtTelefone.setColumns(10);
		
		JLabel lblPlano = new JLabel("Tipo de plano:");
		contentPane.add(lblPlano, "cell 0 3,alignx trailing");
		
		plano = new JComboBox<TipoPlano>();
		plano.addItem(TipoPlano.BASICO);
		plano.addItem(TipoPlano.INTERMEDIARIO);
		plano.addItem(TipoPlano.PREMIUM);
		contentPane.add(plano, "cell 1 3 4 1,growx");
		
		JLabel lblDuracao = new JLabel("Duração:");
		contentPane.add(lblDuracao, "cell 0 4,alignx trailing");
		
		duracao = new JComboBox<TempoDuracao>();
		duracao.addItem(TempoDuracao.MENSAL);
		duracao.addItem(TempoDuracao.SEMESTRAL);
		duracao.addItem(TempoDuracao.ANUAL);
		contentPane.add(duracao, "cell 1 4 4 1,growx");
		
		JLabel lblFrequencia = new JLabel("Frequência semanal:");
		contentPane.add(lblFrequencia, "cell 0 5,alignx trailing");
		
		frequencia = new JComboBox<TempoFrequencia>();
		frequencia.addItem(TempoFrequencia.DUAS_VEZES_POR_SEMANA);
		frequencia.addItem(TempoFrequencia.TRES_VEZES_POR_SEMANA);
		frequencia.addItem(TempoFrequencia.CINCO_VEZES_POR_SEMANA);
		contentPane.add(frequencia, "cell 1 5 4 1,growx");
		

		JLabel lblValorFinal = new JLabel("Valor final:");
		contentPane.add(lblValorFinal, "cell 2 6,alignx left");
		
		JLabel lblResult = new JLabel("");
		contentPane.add(lblResult, "cell 3 6");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			        double preco = 0;
//			        if(txtNome.getText().isEmpty()||txtTelefone.getText().isEmpty()) {
//			            JOptionPane.showMessageDialog(this,"Preecha todos os campos!", 0);
//			            return;
//			        }
			        TipoPlano plano1 = (TipoPlano) plano.getSelectedItem();
			        TempoDuracao duracao1 = (TempoDuracao) duracao.getSelectedItem();
			        TempoFrequencia frequencia1 = (TempoFrequencia) frequencia.getSelectedItem();
			        
			        
			        if(plano1 == TipoPlano.BASICO) {
			            preco = 80;
			        } else if(plano1 == TipoPlano.INTERMEDIARIO) {
			            preco = 120;
			        } else if(plano1 == TipoPlano.PREMIUM) {
			            preco = 180;
			        }
			        
			        if(duracao1 == TempoDuracao.SEMESTRAL) {
			            preco = preco - preco*0.1;
			        } else if(duracao1 == TempoDuracao.ANUAL) {
			            preco = preco - preco*0.2;
			        }
			        
			        
			        if(frequencia1 == TempoFrequencia.TRES_VEZES_POR_SEMANA) {
			            preco = preco + preco*0.2;
			        } else if(frequencia1 == TempoFrequencia.CINCO_VEZES_POR_SEMANA) {
			            preco = preco + preco*0.5;
			        }
			
				
				 lblResult.setText("R$ " + String.format("%.2f", preco));
			}
		});
		contentPane.add(btnCalcular, "cell 1 6");
	}
	
		
		
		 
	}

		

		
		

		


