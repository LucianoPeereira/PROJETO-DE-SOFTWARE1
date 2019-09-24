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

}
