import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextPane;

public class Interface {

	JFrame frmControleDeCaixa;
	
	private static Caixa c1;
	private JTextField textField;
	private JLabel lblListaDeClientes;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmControleDeCaixa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmControleDeCaixa = new JFrame();
		frmControleDeCaixa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmControleDeCaixa.setTitle("CONTROLE DE CAIXA");
		frmControleDeCaixa.setSize(739, 616);
		frmControleDeCaixa.getContentPane().setLayout(null);
		
		JLabel lblInformeOsDados = new JLabel("INFORME OS DADOS DO SEU CAIXA");
		lblInformeOsDados.setBounds(103, 32, 230, 16);
		frmControleDeCaixa.getContentPane().add(lblInformeOsDados);
		
		JLabel lblInformeOId = new JLabel("INFORME O ID DE 1 A 20");
		lblInformeOId.setBounds(64, 60, 165, 16);
		frmControleDeCaixa.getContentPane().add(lblInformeOId);
		
		textField = new JTextField();
		textField.setBounds(227, 55, 48, 26);
		frmControleDeCaixa.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblListaDeClientes = new JLabel("Lista de Clientes");
		lblListaDeClientes.setBounds(146, 117, 114, 16);
		frmControleDeCaixa.getContentPane().add(lblListaDeClientes);
		
		JLabel lblClientesEmAtendimento = new JLabel("Clientes em atendimento");
		lblClientesEmAtendimento.setBounds(471, 117, 165, 16);
		frmControleDeCaixa.getContentPane().add(lblClientesEmAtendimento);
		
		textField_1 = new JTextField();
		textField_1.setBounds(382, 151, 333, 26);
		frmControleDeCaixa.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnEncerrarAtendiemnto = new JButton("Encerrar Atendimento");
		btnEncerrarAtendiemnto.setBounds(442, 255, 194, 29);
		frmControleDeCaixa.getContentPane().add(btnEncerrarAtendiemnto);
		
		JButton btnPrximoCliente = new JButton("PRÓXIMO CLIENTE");
		btnPrximoCliente.setBounds(453, 339, 165, 91);
		frmControleDeCaixa.getContentPane().add(btnPrximoCliente);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(38, 145, 286, 398);
		frmControleDeCaixa.getContentPane().add(textPane);
		
		
			textPane.setText(Sistema.getInstance().mostrarFila());
		
		
	}
}