package edu.udc.psw.modelo;

import edu.udc.psw.modelo.manipulador.ManipuladorFormaGeometrica;

public interface FormaGeometrica {
	
	public Ponto2D centro();
	public double area();
	public double perimetro();
	public double base();
	public double altura();
	
	public ManipuladorFormaGeometrica getManipulador();
	public FormaGeometrica clone();

}
