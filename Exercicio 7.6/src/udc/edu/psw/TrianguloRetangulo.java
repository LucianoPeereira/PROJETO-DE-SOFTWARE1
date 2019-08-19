package udc.edu.psw;

public class TrianguloRetangulo implements FiguraGeometrica {

	private Ponto p1;
	private Ponto p2;
	private Ponto p3;

	public TrianguloRetangulo() {
		p1 = new Ponto();
		p2 = new Ponto();
		p3 = new Ponto();
	}

	public TrianguloRetangulo(Ponto p1, Ponto p2, Ponto p3) {
		this.p1 = p1.clone();
		this.p2 = p2.clone();
		this.p3 = p3.clone();
	}

	public TrianguloRetangulo clone() {
		return new TrianguloRetangulo(p1, p2, p3);
	}

	public float area() {
		return (float) ((float) p1.distancia(p2) + p2.distancia(p3) / 2);
	}

	@Override
	public float comprimento() {// Base
		return (float) p1.distancia(p2);
	}

	@Override
	public float altura() {
		return (float) p2.distancia(p3);
	}

	@Override
	public float perimetro() {
		return (float) ((float) p1.distancia(p2) + p2.distancia(p3) + p3.distancia(p1));
	}
}