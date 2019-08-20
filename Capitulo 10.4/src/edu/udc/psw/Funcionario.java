package edu.udc.psw;

public class Funcionario {
	private String Nome;
	private String Sobrenome;
	private String Departamento;
	private String Data_Admissao;
	private String RG;
	private String CPF;
	private float Salario;
	
	public Funcionario(String nome, String sobrenome, String departamento, String data_Admissao, String rG, String cPF,
			float salario) {
		//super();
		Nome = nome;
		Sobrenome = sobrenome;
		Departamento = departamento;
		Data_Admissao = data_Admissao;
		RG = rG;
		CPF = cPF;
		setSalario(salario);
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public String getData_Admissao() {
		return Data_Admissao;
	}
	public void setData_Admissao(String data_Admissao) {
		Data_Admissao = data_Admissao;
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
	public float getSalario() {
		return Salario;
	}
	public void setSalario(float salario) {
		if(salario<=0)
			Salario = 0;
		Salario = salario;
	}
	@Override
	public String toString() {
		return "\nFuncionario: \nNome = " + Nome + "\nSobrenome = " + Sobrenome + "\nDepartamento = " + Departamento
				+ "\nData_Admissao = " + Data_Admissao + "\nRG = " + RG + "\nCPF = " + CPF + "\nSalario = " + Salario;
	}
	
	public void RecebeAumento(double percentual) {
		setSalario((float) (Salario+(Salario*percentual)));
	}
	
	public float CalculaGanhoAnual() {
		return getSalario()*13;
	}
	
}
