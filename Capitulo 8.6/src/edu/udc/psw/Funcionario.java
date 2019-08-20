package edu.udc.psw;

public class Funcionario extends Pessoa {
	
	private String num_registro;
	private float salario;
	private String Data_Admissao;
	
	public String getNum_registro() {
		return num_registro;
	}
	public void setNum_registro(String num_registro) {
		this.num_registro = num_registro;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getData_Admissao() {
		return Data_Admissao;
	}
	public void setData_Admissao(String data_Admissao) {
		Data_Admissao = data_Admissao;
	}
	@Override
	public String toString() {
		return super.toString() + "Funcionario num_registro=" + num_registro + ", salario=" + salario + ", Data_Admissao=" + Data_Admissao
				;
	}
	
	
	
}
