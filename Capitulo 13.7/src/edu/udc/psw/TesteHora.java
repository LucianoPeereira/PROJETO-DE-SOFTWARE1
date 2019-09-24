package edu.udc.psw;

public class TesteHora {

	public static void main(String[] args) {
		Hora hora = new Hora();
		hora.iniciaHora(3,12,40);
		hora.mostraHoraAproximada();
		
		hora.setHora(11);
		hora.setMinutos(22);
		hora.setSegundos(45);
		System.out.print(hora.mostraHoraAproximada());
		
		Hora hora2 = new Hora();
		System.out.print(hora2.mostraHoraAproximada());
		
		
		
	}

}
