package edu.udc.psw;

import javax.swing.JOptionPane;

public class Mensagem {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
		String idade = JOptionPane.showInputDialog(null, "Qual a sua idade " + nome + "?");
		JOptionPane.showMessageDialog(null, "Olá " + nome + "de " + idade + " anos ");
		int i = Integer.parseInt(idade);
		JOptionPane.showMessageDialog(null, "Olá " + nome + "de " + idade + "anos\n " + "Você nasceu em " + (2019-i));
	}

}
