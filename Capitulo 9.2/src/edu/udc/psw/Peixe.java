package edu.udc.psw;

public class Peixe extends Animal {

	private String caracteristica;

	public Peixe(String nome, String cor, String ambiente, String caracteristica, float comprimento, int numerodepatas,
			float velocidademedia) {
		super(nome, cor, ambiente, comprimento, numerodepatas, velocidademedia);
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public void dadosPeixe() {
		System.out.println();
		super.dados();
		System.out.println("Caracteristica: " + caracteristica);
	}

}
