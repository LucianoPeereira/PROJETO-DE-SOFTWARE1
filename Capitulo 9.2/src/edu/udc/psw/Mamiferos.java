package edu.udc.psw;

public class Mamiferos extends Animal {

	String Alimento;

	public Mamiferos(String nome, String cor, String ambiente, String Alimento, float comprimento, int numerodepatas,
			float velocidademedia) {
		super(nome, cor, ambiente, comprimento, numerodepatas, velocidademedia);
		this.Alimento = Alimento;
	}

	public String getAlimento() {
		return Alimento;
	}

	public void setAlimento(String alimento) {
		Alimento = alimento;
	}

	void dadosMamifero() {
		System.out.println();
		super.dados();
		System.out.println("Alimento: " + Alimento);
	}

}
