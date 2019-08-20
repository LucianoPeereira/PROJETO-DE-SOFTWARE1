package edu.udc.psw;

public class Pessoa {
	
	private String Nome;
	private int idade;
	private String RG;
	private String CPF;
	
	public Pessoa(String nome, int idade) {
		Nome = nome;
		this.idade = idade;
		//RG = rG;
		//CPF = cPF;
	}
	
	void fazAniversario() {
		setIdade(getIdade()+1);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public String toString() {
		return "Pessoa Nome = " + Nome +"\nIdade = " + idade;
	}
	
	
	
	
}
