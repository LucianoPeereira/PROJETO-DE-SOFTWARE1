package edu.udc.psw;

import java.util.Scanner;

public class Produto_1 {
	
	int num1 = 0; 
	int num2 = 0; 
	int num3 = 0;
	
	void lerDados() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nEntre com 3 valores");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
	}
	
	public void produto() {
		System.out.printf("\nProduto dos valores fornecidos = %d", num1*num2*num3);
	}
}
