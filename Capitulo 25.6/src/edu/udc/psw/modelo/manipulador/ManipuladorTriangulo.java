package edu.udc.psw.modelo.manipulador;

import java.awt.Graphics;

import edu.udc.psw.modelo.Ponto2D;
import edu.udc.psw.modelo.Triangulo;

public class ManipuladorTriangulo implements ManipuladorFormaGeometrica {
	private Triangulo triangulo;
	
	public ManipuladorTriangulo(Triangulo t) {
		triangulo = t;
	}

	@Override
	public void click(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void press(int x, int y) {
		Ponto2D p = new Ponto2D(x, y);
		triangulo.setA(p);
		p = new Ponto2D(x, y);
		triangulo.setB(p);
	}

	@Override
	public void release(int x, int y) {
		Ponto2D p = new Ponto2D(x, y);
		triangulo.setB(p);
		
	}

	@Override
	public void drag(int x, int y) {
		Ponto2D p = new Ponto2D(x, y);
		triangulo.setB(p);
		
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
