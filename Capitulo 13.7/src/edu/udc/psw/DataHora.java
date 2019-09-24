package edu.udc.psw;

public class DataHora {
	
	Data data = new Data();
	Hora hora = new Hora();
	
	public DataHora(Data data, Hora hora) {
		this.data = data;
		this.hora = hora;
	}
	public DataHora() {
		Data data = new Data();
		Hora hora = new Hora();
		}
		
	public boolean eIgual(Object dataAux, Object horaAux ) {
		if((data.eIgual(dataAux) == true) && hora.eIgual(horaAux) == true) {
			return true;
		}
		return false;
	}
	
	public boolean eAntes(Object dataAux, Object horaAux ) {
		if((data.eAntes(dataAux) == true) && hora.eAntes(horaAux) == true) {
			return true;
		}
		return false;
	}
	
	public boolean eDepois(Object dataAux, Object horaAux ) {
		if((data.eDepois(dataAux) == true) && hora.eDepois(horaAux) == true) {
			return true;
		}
		return false;
	}

}
