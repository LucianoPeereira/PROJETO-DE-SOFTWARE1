package edu.udc.psw;

public class HoraAproximada {
	private int hora;
	private int minutos;
	private int segundos;

	public HoraAproximada() {
		setHora(0);
		setMinutos(0);
		setSegundos(0);
	}

	public void iniciaHora(int hora, int minutos, int segundos) {
		if (hora >= 0)
			this.hora = hora;
		else
			this.hora = 0;
		if (minutos >= 0)
			this.minutos = minutos;
		else
			this.minutos = 0;
		if (segundos >= 0)
			this.segundos = segundos;
		else
			this.segundos = 0;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	
	public String mostraHoraAproximada() {
		return "HoraAproximada Hora:" + hora + ", Minutos:" + minutos + ", Segundos:" + segundos + "";
	}

}
