package edu.udc.psw;

public class TesteHora {

	public static void main(String[] args) {
		HoraAproximada hora = new HoraAproximada();
		hora.iniciaHora(3,12,40);
		hora.mostraHoraAproximada();
		
		hora.setHora(11);
		hora.setMinutos(22);
		hora.setSegundos(45);
		System.out.print(hora.mostraHoraAproximada());
		
		HoraAproximada hora2 = new HoraAproximada();
		System.out.print(hora2.mostraHoraAproximada());
		
		
		
	}

}
