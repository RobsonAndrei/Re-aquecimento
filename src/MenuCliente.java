import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Cliente c1;
	public static Sistema sis;
	public static PureQueue<Cliente> fila;
	

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCliente frame = new MenuCliente();
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
	public MenuCliente() {

		sis = Sistema.getInstance();

		

		setTitle("MENU CLIENTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblInsiraSeusDsdos = new JLabel("INSIRA SEUS DSDOS PARA AGILIZAR O SEU ATENDIMENTO");
		lblInsiraSeusDsdos.setBounds(172, 17, 379, 16);
		contentPane.add(lblInsiraSeusDsdos);

		JLabel lblNomeCompleto = new JLabel("NOME COMPLETO:");
		lblNomeCompleto.setBounds(43, 52, 124, 16);
		contentPane.add(lblNomeCompleto);

		JLabel lblIdade = new JLabel("IDADE:");
		lblIdade.setBounds(43, 105, 61, 16);
		contentPane.add(lblIdade);

		textField = new JTextField();
		textField.setBounds(182, 47, 497, 26);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(96, 100, 43, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnEntrarNaFila = new JButton("ENTRAR NA FILA PARA ATENDIMENTO");
		btnEntrarNaFila.addActionListener(new ActionListener() {
			
		
			
			String nome = "";
			int idade;

			public void actionPerformed(ActionEvent e) {
				nome = textField.getText();
				idade = Integer.parseInt(textField_1.getText());
				c1 = new Cliente(nome, idade);
				sis.addCliente(c1);
				System.out.println(sis.mostrarFila());
			
				

				textField.setText("");
				textField_1.setText("");

			}
		});
		btnEntrarNaFila.setBounds(254, 100, 295, 29);
		contentPane.add(btnEntrarNaFila);
	}

}
