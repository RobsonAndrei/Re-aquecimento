import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.PortableServer.ImplicitActivationPolicyOperations;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEscolhaSuaOpo = new JLabel("Escolha sua opção do sistema");
		lblEscolhaSuaOpo.setBounds(131, 24, 197, 16);
		contentPane.add(lblEscolhaSuaOpo);

		JButton btnCaixa = new JButton("Caixa");
		btnCaixa.setBackground(new Color(0, 0, 139));
		btnCaixa.setForeground(new Color(0, 128, 128));
		btnCaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Interface inface = new Interface();
				inface.frmControleDeCaixa.setVisible(true);
			}
		});
		btnCaixa.setBounds(63, 78, 117, 29);
		contentPane.add(btnCaixa);

		JButton btnCliente = new JButton("Cliente");
		btnCliente.setBackground(new Color(0, 0, 255));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuCliente mClien = new MenuCliente();
				mClien.setVisible(true);
				
			}
		});
		btnCliente.setForeground(Color.BLUE);
		btnCliente.setBounds(258, 78, 117, 29);
		contentPane.add(btnCliente);
	}
}
