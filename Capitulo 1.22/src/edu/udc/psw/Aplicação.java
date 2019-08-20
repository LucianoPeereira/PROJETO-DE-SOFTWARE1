package edu.udc.psw;

public class Aplicação {

	public static void main(String[] args) {
		Pessoa a1 = new Pessoa("Luciano", 23);
		System.out.println(a1.toString());
		
		a1.fazAniversario();
		System.out.println(a1.toString());
		
		a1.fazAniversario();
		System.out.println(a1.toString());
		a1.fazAniversario();
		System.out.println(a1.toString());
		
		

	}

}
