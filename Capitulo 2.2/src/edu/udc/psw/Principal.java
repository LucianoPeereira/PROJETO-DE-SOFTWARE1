package edu.udc.psw;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num1 = 0; int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com dois valores inteiros: \n");
		num1 = sc.nextInt(); num2 = sc.nextInt();
		
		Exercicio1 obj = new Exercicio1();
		obj.Soma(num1, num2);
		obj.Diferenca(num1, num2);		
	}
}