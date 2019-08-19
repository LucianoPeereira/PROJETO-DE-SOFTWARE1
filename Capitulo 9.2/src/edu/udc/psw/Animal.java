package edu.udc.psw;

public class Animal {
	String nome;
	String cor;
	String ambiente;
	float comprimento;
	float velocidademedia;
	int numerodepatas;

	public Animal(String nome, String cor, String ambiente, float comprimento, int numerodepatas,
			float velocidademedia) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.numerodepatas = numerodepatas;
		this.velocidademedia = velocidademedia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getNumerodepatas() {
		return numerodepatas;
	}

	public void setNumerodepatas(int numerodepatas) {
		this.numerodepatas = numerodepatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public float getVelocidademedia() {
		return velocidademedia;
	}

	public void setVelocidademedia(float velocidademedia) {
		this.velocidademedia = velocidademedia;
	}

	public void dados() {
		System.out.println("Nome: " + nome);
		System.out.println("Ambiente: " + ambiente);
		System.out.println("Cor: " + cor);
		System.out.println("Comprimento em Cm: " + comprimento);
		System.out.println("Velocidade Media M/s: " + velocidademedia);
		System.out.println("Numero de patas: " + numerodepatas);
	}
}
