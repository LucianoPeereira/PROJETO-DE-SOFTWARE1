package udc.edu.psw;

public class Ponto {

	private int x;
	private int y;

	public Ponto() {
		x = 0;
		y = 0;
	}

	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Ponto clone() {
		return new Ponto(x, y);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double distancia(Ponto p) {
		return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
	}
}