package edu.udc.psw;

public class Retangulo {
	private Linha l;
	private Ponto2D a;
	private Ponto2D b;

	public Retangulo() {
		a = new Ponto2D();
		b = new Ponto2D();
	}

	public Retangulo(Ponto2D a, Ponto2D b) {
		this.a = a.clone();
		this.b = b.clone();
	}

	public Retangulo(float ax, float ay, float bx, float by) {
		a = new Ponto2D(ax, ay);
		b = new Ponto2D(bx, by);
	}

	@Override
	public Linha clone() {
		return new Linha(a, b);
	}

	public Linha getL() {
		return l;
	}

	public void setL(Linha l) {
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

	@Override
	public String toString() {
		return a.toString() + b.toString();
	}
}