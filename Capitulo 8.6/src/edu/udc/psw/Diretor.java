package edu.udc.psw;

public class Diretor extends Pessoa{
	
	private String Ano_mandato;

	public String getAno_mandato() {
		return Ano_mandato;
	}

	public void setAno_mandato(String ano_mandato) {
		Ano_mandato = ano_mandato;
	}

	@Override
	public String toString() {
		return super.toString() + "Diretor Ano_mandato=" + Ano_mandato;
	}
	
	
	
}
