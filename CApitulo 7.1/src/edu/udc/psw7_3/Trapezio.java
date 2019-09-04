package edu.udc.psw7_3;

import edu.udc.psw.Ponto2D;

public class Trapezio extends Quadrilatero {
	
	public Trapezio(float ax, float bx, float ay, float by) {
		super(ax, bx, ay, by);
	}
	
	public Trapezio(Ponto2D a, Ponto2D b) {
		super(a, b);
	}

	void mostrarDados() {
		System.out.print("Area do Trapezio : " + area());
	}
}
