package edu.udc.psw;

public class TestarAnimais {

	public static void main(String[] args) {
		
		Mamiferos a = new Mamiferos("Camelo", "Amarelo", "Terra", 
				null, 150, 4, 2);
		a.dadosMamifero();
		
		Peixe b = new Peixe("Tubarao", "Cinzento", "Mar", "Barbatanas e Cauda",
				300, 0, 2);
		b.dadosPeixe();
		
		Mamiferos c = new Mamiferos("Urso-do_Canada", "Vermelho", "Terra","Mel", 
				 180, 4, 05);
		c.dadosMamifero();
		
	}

}
