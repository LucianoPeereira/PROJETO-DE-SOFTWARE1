package edu.udc.psw;

public abstract class HoraPrecisa extends Hora {
	private int Centesimo;
	
	public HoraPrecisa() {
		setCentesimo(0);
	}
	
	public int getCentesimo() {
		return Centesimo;
	}

	public void setCentesimo(int centecimo) {
		if(centecimo >=0)
			this.Centesimo = centecimo;
		else
			this.Centesimo=0;
	}
	
}
