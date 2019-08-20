package edu.udc.psw;

public class Aluno extends Pessoa {
	
	private String curso;
	private String serie;
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Aluno curso=" + curso + ", serie=" + serie;
	}
	
	
	
}
