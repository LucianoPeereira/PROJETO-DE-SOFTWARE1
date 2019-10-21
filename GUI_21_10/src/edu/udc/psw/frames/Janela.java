package edu.udc.psw.frames;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public Janela() {
		super("Titulo da Janela");
		setLayout(new BorderLayout());
		
		JLabel label = new JLabel("Mensagem na janela!");
		this.add(label, BorderLayout.CENTER);
		JLabel label2 = new JLabel("Nova mensagem na janela!");
		this.add(label2, BorderLayout.NORTH);
		
	}
}
