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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	JFrame frmControleDeCaixa;

	private static Caixa c1;
	private JTextField textField;
	private JLabel lblListaDeClientes;
	private JTextField textField_1;
	private String texto;
	private JTextPane textop;

	/**
	 * Launch the application.
	 */

	public void setJtext(JTextPane j) {
		this.textop = j;
	}

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

		Sistema.getInstance();

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

		textop = new JTextPane();
		textop.setBounds(38, 145, 286, 398);
		frmControleDeCaixa.getContentPane().add(textop);

		textop.setText(Sistema.getInstance().mostrarFila());

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
		btnPrximoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1 = new Caixa(Integer.parseInt(textField.getText()));
				if (c1.getId() >= 1 & c1.getId() <= 5) {

					textField_1.setText(Sistema.getInstance().nextClientIdoso().getNome());
					textop.setText(Sistema.getInstance().mostrarFila());

				} else {

					textField_1.setText(Sistema.getInstance().nextNormal().getNome());
					textop.setText(Sistema.getInstance().mostrarFila());
				}

			}

		});
		btnPrximoCliente.setBounds(453, 339, 165, 91);
		frmControleDeCaixa.getContentPane().add(btnPrximoCliente);

	}
}
