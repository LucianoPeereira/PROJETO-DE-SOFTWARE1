package edu.udc.psw;

public class Retangulo extends FormaGeometrica{
	private Ponto2D a;
	private Ponto2D b;

	public Retangulo() {
		a = new Ponto2D(0, 0);
		b = new Ponto2D(1, 1);
	}

	public Retangulo(Ponto2D b) {
		a = new Ponto2D(0, 0);
		this.b = new Ponto2D(b.getX(), b.getY());
	}
	
	public Retangulo(Ponto2D a, Ponto2D b) {
		this.a = new Ponto2D(a.getX(), a.getY());
		this.b = new Ponto2D(b.getX(), b.getY());
	}

	public Retangulo(float ax, float ay, float bx, float by) {
		a = new Ponto2D(ax, ay);
		b = new Ponto2D(bx, by);
	}

	public float perimetro() {
		return 2 * altura() + 2 * comprimento();
	}

	@Override
	public float area() {
		return altura() * comprimento();
	}

	@Override
	public float comprimento() {
		return (float) Math.abs(a.getX() - b.getX());
	}

	@Override
	public float altura() {
		return (float) Math.abs(a.getY() - b.getY());
	}

	@Override
	public Ponto2D centro() {
		return new Ponto2D((a.getX()+b.getX())/2,
				(a.getY()+b.getY())/2);
	}
	
	public float distanciaCentro(Ponto2D p) {
		return (float) Math.sqrt((centro().getX() - p.getX()) * (centro().getX() - p.getX()) + 
				(centro().getY() - p.getY()) * (centro().getY() - p.getY()));
	}
	
	public float distanciaFigura(Ponto2D p) {
		return (float) Math.sqrt((centro().getX() - p.getX()) * (centro().getX() - p.getX()) + 
				(centro().getY() - p.getY()) * (centro().getY() - p.getY()));
	}

	
	@Override
	public String toString() {
		return a.toString() + b.toString();
	}
	
}