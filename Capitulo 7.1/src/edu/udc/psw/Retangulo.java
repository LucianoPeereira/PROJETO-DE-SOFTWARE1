package edu.udc.psw;

public class Retangulo {
	private Linha l;

	public Retangulo() {
		l = new Linha();
	}

	public Retangulo(Linha l) {
		this.l = l;
	}

	public double base() {
		return l.base();
	}

	public double altura() {
		return l.altura();
	}

	public double area() {
		return base() * altura();
	}
}