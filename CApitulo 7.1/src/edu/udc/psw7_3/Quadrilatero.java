package edu.udc.psw7_3;

import edu.udc.psw.Ponto2D;

public class Quadrilatero {
	
	private Ponto2D a;
	private Ponto2D b;

	public Quadrilatero() {
		a = new Ponto2D();
		b = new Ponto2D();
	}
	
	public Quadrilatero(Ponto2D a, Ponto2D b) {
		this.a = new Ponto2D(a.getX(), a.getY());
		this.b = new Ponto2D(b.getX(), b.getY());
	}

	public Quadrilatero(float ax, float ay, float bx, float by) {
		a = new Ponto2D(ax, ay);
		b = new Ponto2D(bx, by);
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
	
}
