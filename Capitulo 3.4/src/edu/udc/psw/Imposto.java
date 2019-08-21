package edu.udc.psw;

public class Imposto {

	private float salario;
	
	Imposto(){
		salario = 0;
	}
	
	public String Classifica(double salario) {
		if(salario <= 2487.00)
			return "Taxa 0";
		
		else if(salario > 2487.00 && salario <= 3873.00)
			return "13%";
		
		else if(salario > 3873 && salario <= 4733.00)
			return "17%";
		else if(salario > 4733 && salario <= 5827.00)
			return "22%";
		return "27%";
	}
	
	public double ClassificaAnual(double salario) {
		if(salario <= 2487.00)
			return salario;
		
		else if(salario > 2487.00 && salario <= 3873.00)
			return 12 *(salario *0.13);
		
		else if(salario > 3873 && salario <= 4733.00)
			return 12 *(salario *0.17);
		
		else if(salario > 4733 && salario <= 5827.00)
			return 12 *(salario *0.22);
		
		return 12 *(salario *0.27);
	}
}
