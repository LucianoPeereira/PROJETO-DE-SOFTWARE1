package edu.udc.psw.frames;

import javax.swing.JFrame;

public class Aplicaçaojanela {

	public static void main(String[] args) {
		Janela janela = new Janela();
		janela.setSize(300, 300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);

	}

}
