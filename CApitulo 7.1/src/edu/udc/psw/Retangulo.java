package edu.udc.psw;

public class Retangulo {
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

	public Retangulo clone() {
		return new Retangulo(a, b);
	}

	public double base() {
		if (a.getX() < b.getX()) {
			return b.getX() - a.getX();
		}
		return a.getX() - b.getX();
	}

	public double altura() {
		if (a.getY() < b.getY())
			return b.getY() - a.getY();
		return a.getY() - b.getY();
	}

	public double area() {
		return base() * altura();
	}

	@Override
	public String toString() {
		return a.toString() + b.toString();
	}
}