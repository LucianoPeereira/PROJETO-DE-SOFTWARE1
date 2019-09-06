package edu.udc.psw;

public class Ponto2D extends FormaGeometrica {

	private double x;
	private double y;
	
	public Ponto2D() {
		x = 0.0;
		y = 0.0;
	}

	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

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

	public double distancia(Ponto2D p) {
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}

	@Override
	public String toString() {
		return String.format("(%.2f; %.2f)", x, y);
	}
	
	public boolean equals(Object obj) { //Comparando objetos
		if(obj == null)
			return false;
		if(obj.getClass().equals(Ponto2D.class))
			return false;
		if(obj == this)//Comparando com ele mesmo
			return true;
		
		if(this.x != ((Ponto2D)obj).x)
			return false;
		if(this.y != ((Ponto2D)obj).y)
			return false;
		
		return true;
	}

	public Ponto2D centro() {
		return new Ponto2D(x, y);
	}

	public float area() {
		return 0;
	}

	public float perimetro() {
		return 0;
	}

	public float altura() {
		return 0;
	}

	@Override
	public float comprimento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float distanciaCentro(Ponto2D a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float distanciaFigura(Ponto2D a) {
		// TODO Auto-generated method stub
		return 0;
	}
}