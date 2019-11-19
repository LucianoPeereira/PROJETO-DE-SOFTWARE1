package edu.udc.psw.modelo.manipulador;

import java.awt.Graphics;

public interface ManipuladorFormaGeometrica {
	
	public void click(int x, int y);
	public void press(int x, int y);
	public void release(int x, int y);
	public void drag(int x, int y);
	public void paint(Graphics g);
	
}
