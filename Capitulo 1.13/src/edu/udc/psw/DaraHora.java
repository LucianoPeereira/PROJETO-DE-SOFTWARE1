package edu.udc.psw;

public class DaraHora {
	
	public static void main(String[] args) {
		Data data= new Data();
		HoraAproximada hora =new HoraAproximada();
		
		data.iniciaData(29,2,2017);
		hora.iniciaHora(9, 23, 30);
		data.dataEValida();
		//data.mostrarData();
		//hora.mostraHoraAproximada();
	}
	
	
}
