package edu.udc.psw.modelo;

import edu.udc.psw.modelo.manipulador.ManipuladorFormaGeometrica;

public class Triangulo implements FormaGeometrica{

	private Ponto2D a;
	private Ponto2D b;
	private Ponto2D c;
	
	public Triangulo(){
		a = new Ponto2D();
		b = new Ponto2D();
		c = new Ponto2D();
	}
	
	public Triangulo(Ponto2D a, Ponto2D b, Ponto2D c){
		this.a = a.clone();
		this.b = b.clone();
		this.c = c.clone();
	}
	
	public Triangulo(float ax, float ay, float bx, float by, float cx, float cy){
		a = new Ponto2D(ax, ay);
		b = new Ponto2D(bx, by);
		c = new Ponto2D(cx, cy);
	}
	
	@Override
	public Ponto2D centro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimetro() {
		 //return new Ponto2D((a.getX() + b.getX() + c.getX()), (a.getY() + b.getY() + c.getY());
		return 0;
	}

	@Override
	public double base() {
		// TODO Auto-generated method stubs
		return 0;
	}

	@Override
	public double altura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ManipuladorFormaGeometrica getManipulador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FormaGeometrica clone() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	//public double perimetro() {
		//// TODO Auto-generated method stub
		//return 0;
	//}

}
