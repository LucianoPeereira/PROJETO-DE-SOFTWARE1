package edu.udc.psw;

public class Aplica��o {

	public static void main(String[] args) {
		AumentoSalarial t = new AumentoSalarial();
		System.out.println(t.Classifica("Bobao", 2501.00));

		System.out.println(t.Aumento("Bobao", 2501.00));
	}

}
