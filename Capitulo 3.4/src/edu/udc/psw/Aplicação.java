package edu.udc.psw;

public class Aplicação {

	public static void main(String[] args) {
		Imposto ir = new Imposto();
		System.out.println(ir.Classifica(4000.0));
		
		System.out.println("Imposto Anual: " + ir.ClassificaAnual(4000.0));
		
	}

}
