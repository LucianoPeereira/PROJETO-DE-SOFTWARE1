package edu.udc.psw;

public class EventoDelegacao  {

	DataHora data_hora;
	String tipo;

	EventoDelegacao(Data data, Hora hora) {
		this.data_hora = new DataHora(data, hora);

		tipo = "Delegação/Composição";
	}

	EventoDelegacao() {
		this.data_hora = new DataHora();

		tipo = "Delegação/Composição";
	}

	public String getTipo() { 
		return tipo; 
	}
}
