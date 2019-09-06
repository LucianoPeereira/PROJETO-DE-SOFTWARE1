package edu.udc.psw;

public abstract class FormaGeometrica {
	
	public abstract float area();
	public abstract float perimetro();
	public abstract float comprimento();
	public abstract float altura();
	public abstract Ponto2D centro();
	public abstract float distanciaCentro(Ponto2D a);
	public abstract float distanciaFigura(Ponto2D a);
	
	}

