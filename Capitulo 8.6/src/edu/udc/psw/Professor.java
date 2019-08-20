package edu.udc.psw;

public class Professor extends Pessoa {

	private String Disciplina;
	
	public String getDisciplina() {
		return Disciplina;
	}

	public void setDisciplina(String disciplina) {
		Disciplina = disciplina;
	}

	@Override
	public String toString() {
		return super.toString() + "Professor Disciplina=" + Disciplina;
	}
	
	
}
