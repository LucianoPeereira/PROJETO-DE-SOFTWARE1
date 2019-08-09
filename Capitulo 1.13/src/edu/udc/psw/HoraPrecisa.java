package edu.udc.psw;

public abstract class HoraPrecisa extends HoraAproximada {
	private int centecimo;
	
	public HoraPrecisa() {
		setCentecimo(0);
	}
	
	public int getCentecimo() {
		return centecimo;
	}

	public void setCentecimo(int centecimo) {
		if(centecimo >=0)
			this.centecimo = centecimo;
		else
			this.centecimo=0;
	}
	
}
