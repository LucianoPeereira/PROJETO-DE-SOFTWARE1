package edu.udc.psw;

public class AumentoSalarial {
	String Funcionario;
	String Funcionario2;
	double salario;
	
	AumentoSalarial(){
		salario = 0;
	}
	
	public double Classifica (String Funcionario, double salario) {
		if(Funcionario.equalsIgnoreCase("Diretor")) {
			if(salario <=6000.00)
				return salario*0.025;
			else 
				return salario*0.015;
		}
		else if(Funcionario.equalsIgnoreCase("Gerente")) {
			if(salario <=5000.00)
				return salario*0.025;
			else 
				return salario*0.020;
		}
		else if(salario <=2500.00) 
			return salario*0.040;
		return salario*0.030;
	}
	
	public double Aumento (String Funcionario, double salario) {
		if(Funcionario.equalsIgnoreCase("Diretor")) {
			if(salario <=6000.00)
				return salario+salario*0.025;
			else 
				return salario+salario*0.015;
		}
		else if(Funcionario.equalsIgnoreCase("Gerente")) {
			if(salario <=5000.00)
				return salario+salario*0.025;
			else 
				return salario+salario*0.020;
		}
		else if(salario <=2500.00) 
			return salario+salario*0.040;
		return salario+salario*0.030;
	}
}
