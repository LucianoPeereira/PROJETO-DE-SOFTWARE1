package edu.udc.psw;

public class Pessoa {
	
	private String Nome;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa Nome=" + Nome ;
	}
	
	
	
}
