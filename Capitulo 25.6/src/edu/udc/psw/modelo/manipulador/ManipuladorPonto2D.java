package edu.udc.psw.modelo.manipulador;

import java.awt.Graphics;

import edu.udc.psw.modelo.Ponto2D;

public class ManipuladorPonto2D implements ManipuladorFormaGeometrica {
	private Ponto2D ponto;
	
	public ManipuladorPonto2D(Ponto2D p) {
		ponto = p;
	}
	
	@Override
	public void click(int x, int y) {
		ponto.setX(x);
		ponto.setY(y);
	}

	@Override
	public void press(int x, int y) {
	}

	@Override
	public void release(int x, int y) {
		ponto.setX(x);
		ponto.setY(y);
	}

	@Override
	public void drag(int x, int y) {
	}

	@Override
	public void paint(Graphics g) {
		g.drawLine((int) ponto.getX(), (int) ponto.getY(), 
				(int) ponto.getX(), (int) ponto.getY());
	}

}
