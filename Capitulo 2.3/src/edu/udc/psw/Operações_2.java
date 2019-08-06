package edu.udc.psw;

import java.util.Scanner;

public class Operações_2 {
	
	int num1 = 0; 
	int num2 = 0; 
	
	void lerDados() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nEntre com 2 valores");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}

	public void Soma() {
		System.out.printf("\nSoma dos valores = %d", num1+num2);
	}
	
	public void Diferença() {
		System.out.printf("\nDiferença dos valores = %d", num1-num2);
	}
	
	public void Produto() {
		System.out.printf("\nProduto dos valores = %d", num1*num2);
	}
	
	public void Quociente() {
		if(num1!=0||num1!=0) {
			System.out.printf("\nQuociente dos valores = %d", num1/num2);
		}
		else
			System.out.println("\nDivisão inconsistente");
	}
}
