package edu.udc.psw;

import java.util.Scanner;

public class ParOUimpar_4 {
	
	int num1 = 0; 
	
	void lerDados() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nEntre com 1 valor");
		num1 = sc.nextInt();
	}
	
	public void parOUimpar() {
		if(num1%2==0) {
			System.out.print("\nValor Par");
			}
		else {
			System.out.print("\nValor Impar");
		}
	}
}