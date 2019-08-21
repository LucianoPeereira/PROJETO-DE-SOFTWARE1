package edu.udc.psw;

public class Aplicação {

	public static void main(String[] args) {
		AumentoSalarial t = new AumentoSalarial();
		System.out.println(t.Classifica("Diretor", 6000.00));

		System.out.println(t.Aumento("Diretor", 6000.00));
	}

}
