package edu.udc.psw.frames2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JanelaEntrada extends JFrame {

	private static final long serialVersionUID = 1L;
	JTextField nome;
	JPasswordField password;

	public JanelaEntrada() {
		super("Janela com Campos de entrada");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout());
		
//		add(new JLabel("Qual é o seu nome? ", 20));
//		add(new JTextField(10));
		// Campo de texto para solicitar informaçoes do usuario // Normalmente e seguido por uma variavel para captura de dados
		
		add(new JLabel("Qual é o seu nome? "));
		nome = new JTextField(20);
		nome.addActionListener(new ActionListener() { //Classe Anonima

			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Ola" + ((JTextField)event.getSource()).getText() + "!");
			}
		});
		add(nome);
		
		add(new JTextField("Digite algo aqui", 20));
		JTextField textField = new JTextField("Campo não editável");
		textField.setEditable(false); // Desativa a opcao do Usuario editar a caixa de dialogo
		textField.addActionListener(new TextFieldHandler()); // Se posicionado o Mouse emcima é possivel observa-lo
		add(textField);

		// add(new JLabel("Digite uma senha: "));
		// add(new JPasswordField(20));

		add(new JLabel("Digite uma senha: "));
		password = new JPasswordField(20);
		password.setToolTipText("Uma dica para o campo de senha..."); // Cria um balao de dica no campo
		password.addActionListener(new TextFieldHandler()); // Se posicionado o Mouse emcima é possivel observa-lo
		add(password);
		
		JButton button = new JButton("Comando");
		button.addActionListener(new ActionListener() {//Clase Anonima

			@Override
			public void actionPerformed(ActionEvent event) {
				String senha = new String(password.getPassword());
				JOptionPane.showMessageDialog(null, nome.getText() + " sua senha é: \n" + senha);
			}
			
		});
		add(button);
		setVisible(true);
	}

	// Tratamento de Eventos no JAVA
	class TextFieldHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) { // Implementado para verificar acoes do usuario (Eventos)
			String str = new String(((JPasswordField) event.getSource()).getPassword());// Programa um evento para chamar
																						// uma caixa de dialogo a partir de um evento do usuario, nesse exemplo :Campo Password
			JOptionPane.showMessageDialog(null, str); // Mostra a String digitada na caixa
		}
	}
}
