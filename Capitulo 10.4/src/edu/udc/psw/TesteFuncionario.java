package edu.udc.psw;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario a1 = new Funcionario("Luciano", "Pereira", "T.I", "22/03/2018", "123", "456", 490);
		System.out.println(a1.toString());
		System.out.printf("\nGanho Anual %.2f", a1.CalculaGanhoAnual());
		
		a1.RecebeAumento(0.10);
		System.out.printf("\nGanho Anual %.2f", a1.CalculaGanhoAnual());
		
		System.out.println();
		Funcionario a2 = new Funcionario("Miguel", "Silva", "T.I", "11/02/2009", "798", "456", 7200);
		System.out.println(a2.toString());
		System.out.printf("\nGanho Anual %.2f", a2.CalculaGanhoAnual());
		
		a2.RecebeAumento(0.10);
		System.out.printf("\nGanho Anual %.2f\n", a2.CalculaGanhoAnual());
	}

}
