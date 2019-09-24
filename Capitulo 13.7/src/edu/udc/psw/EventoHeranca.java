package edu.udc.psw;

public class EventoHeranca extends DataHora {

	String tipo;

	EventoHeranca(Data data, Hora hora) {
		super(data, hora);

		tipo = "Herança";
	}

	EventoHeranca() {
		super();
		
		tipo = "Herança";
	}

	public String getTipo() { 
		return tipo; 
	}
}
