package edu.udc.psw;

public class Aplica��o {

	public static void main(String[] args) {
		Leitura ler = new Leitura();
		Xis x = new Xis(ler.lerDados());
		
		x.FazX();
		x.ImprimeX();
	}

}
