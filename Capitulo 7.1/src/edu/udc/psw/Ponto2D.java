package edu.udc.psw;

public class Ponto2D {

	private double x;
	private double y;

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Ponto2D() {
		x = 0.0;
		y = 0.0;
	}

	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public Ponto2D clone() {
		return new Ponto2D(x, y);
	}

	public double distancia(Ponto2D p) {
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}

	@Override
	public String toString() {
		return String.format("(%.2f; %.2f)", x, y);
	}

	public Ponto2D centro() {
		return clone();
	}

	public double area() {
		return 0;
	}

	public double perimetro() {
		return 0;
	}

	public double base() {
		return 0;
	}

	public double altura() {
		return 0;
	}
}