package edu.udc.psw;

public class Linha extends FormaGeometrica {
	private Ponto2D a;
	private Ponto2D b;
	
	public Linha() {
		a = new Ponto2D(0, 0);
		b = new Ponto2D(1, 1);
	}

	public Linha(Ponto2D b) {
		a = new Ponto2D(0, 0);
		this.b = new Ponto2D(b.getX(), b.getY());
	}
	
	public Linha(Ponto2D a, Ponto2D b) {
		this.a = new Ponto2D(a.getX(), a.getY());
		this.b = new Ponto2D(b.getX(), b.getY());
	}

	public Linha(float ax, float ay, float bx, float by) {
		a = new Ponto2D(ax, ay);
		b = new Ponto2D(bx, by);
	}

	public Ponto2D centro() {
		return new Ponto2D((a.getX()+b.getX())/2,
				(a.getY()+b.getY())/2);
	}

	public Ponto2D getA() {
		return new Ponto2D(a.getX(), a.getY());
	}

	public Ponto2D getB() {
		return new Ponto2D(b.getX(), b.getY());
	}

	public void setA(Ponto2D a) {
		this.a = new Ponto2D(a.getX(), a.getY());
	}

	public void setB(Ponto2D b) {
		this.a = new Ponto2D(b.getX(), b.getY());
	}

	public float area() {
		return 0;
	}

	public float perimetro() {
		return (float) a.distancia(b);
	}
	
	public float altura() {
		return (float) Math.abs(a.getY() - b.getY());
	}
	
	public float comprimento() {
		return (float) Math.abs(a.getX() - b.getX());
	}
	
	public double distanciaP(Ponto2D p) {
		return Math.sqrt((centro().getX() - p.getX()) * (centro().getX() - p.getX()) + 
				(centro().getY() - p.getY()) * (centro().getY() - p.getY()));
	}
	
	public double Angulo() {
		return Math.tan((b.getY() - a.getY())/b.getX() - a.getY());
	}
	
	@Override
	public String toString() {
		return a.toString() + b.toString();
	}

	public float distanciaCentro(Ponto2D p) {
		return (float) Math.sqrt((centro().getX() - p.getX()) * (centro().getX() - p.getX()) + 
				(centro().getY() - p.getY()) * (centro().getY() - p.getY()));
	}

	public float distanciaFigura(Ponto2D p) {
		return (float) Math.sqrt((centro().getX() - p.getX()) * (centro().getX() - p.getX()) + 
				(centro().getY() - p.getY()) * (centro().getY() - p.getY()));
	}

}