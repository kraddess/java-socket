package main;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ServerGUI {
	private JFrame frmServer;
	private JTextField textField;
	JTextArea textArea = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerGUI window = new ServerGUI();
					window.frmServer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ServerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmServer = new JFrame();
		frmServer.setTitle("Server");
		frmServer.setBounds(100, 100, 662, 318);
		frmServer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmServer.getContentPane().setLayout(null);
		textField = new JTextField();
		textField.setBounds(10, 222, 458, 47);
		frmServer.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty()) {}
				else {
					textArea.append("Client : "+ textField.getText()+"\n");
				}
			}
		});
		btnSend.setForeground(SystemColor.activeCaption);
		btnSend.setFont(new Font("Source Sans Pro SemiBold", Font.PLAIN, 20));
		btnSend.setBounds(475, 222, 150, 47);
		frmServer.getContentPane().add(btnSend);
		
		
		textArea.setEditable(false);
		textArea.setBounds(10, 11, 613, 200);
		frmServer.getContentPane().add(textArea);
	}
	private void DisplayChat() {
		
	}
}
