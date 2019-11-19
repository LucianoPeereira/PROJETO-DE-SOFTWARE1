package edu.udc.psw.modelo.manipulador;

import java.awt.Graphics;

public class ManipuladorCirculo implements ManipuladorFormaGeometrica {
	
	private int originX, originY;
	private int radiusX, radiusY;

	@Override
	public void click(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void press(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void release(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drag(int a, int b) {
		radiusX = a;
		radiusY = b;
		
		int x = Math.abs(originX - radiusX);
		int y = Math.abs(originY - radiusY);
		
		double r = Math.sqrt((x*x) + (y*y));

		double area = Math.PI * r * r;
				
		double circ = Math.PI * 2 * r;
		
	
		//(int) Math.abs(r);
						
//		message = origin + " - " + String.format("Raio: [%d; %d][%.2f]", radiusX, radiusY, r)  + " - " + 
//				String.format("Area: [%.2f]", area) + " - " + String.format("Circunferencia: [%.2f]", circ);
//		
//		status.setText(message);
		
	}

	@Override
	public void paint(Graphics g) {
		
		int x = originX - radiusX;
		int y = originY - radiusY;
		
		g.drawOval(x, y, radiusX*2, radiusY*2);
		
	}

}
