package edu.udc.psw7_2;

public class Retangulo {
	private double comprimento;
	private double largura;

	public Retangulo() {
		comprimento = 1.0;
		largura = 1.0;
	}

	public Retangulo(double comprimento, double largura) {
		setComprimento(comprimento);
		setLargura(largura);
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		if(comprimento >=1.0 && comprimento <=20.0) {
			this.comprimento = comprimento;
		}
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		if(largura >=1.0 && largura <=20.0) {
			this.largura = largura;
		}
	}

	public double area() {
		return comprimento*largura;
	}
	
	public double perimetro() {
		return 2*(comprimento+largura);
	}
}