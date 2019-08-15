package edu.udc.psw;

public class Linha {
	private Ponto2D a;
	private Ponto2D b;

	public Linha() {
		a = new Ponto2D();
		b = new Ponto2D();
	}

	public Linha(Ponto2D a, Ponto2D b) {
		this.a = a.clone();
		this.b = b.clone();
	}

	public Linha(float ax, float ay, float bx, float by) {
		a = new Ponto2D(ax, ay);
		b = new Ponto2D(bx, by);
	}

	@Override
	public Linha clone() {
		return new Linha(a, b);
	}

	public double comprimento() {
		return a.distancia(b);
	}

	public Ponto2D centro() {
		Ponto2D m = new Ponto2D((a.getX() + b.getX()) / 2, (a.getY() + b.getY()) / 2);
		return m;
	}

	public double base() {
		if (a.getX() < b.getX())
			return b.getX() - a.getX();
		return a.getX() - b.getX();
	}

	public double altura() {
		if (a.getY() < b.getY())
			return b.getY() - a.getY();
		return a.getY() - b.getY();
	}

	public Ponto2D getA() {
		return a.clone();
	}

	public Ponto2D getB() {
		return b.clone();
	}

	public void setA(Ponto2D a) {
		this.a = a.clone();
	}

	public void setB(Ponto2D b) {
		this.b = b.clone();
	}

	@Override
	public String toString() {
		return a.toString() + b.toString();
	}

	public double area() {
		return 0;
	}

	public double perimetro() {
		return comprimento();
	}

}