package edu.udc.psw;

import java.util.Scanner;

public class Media_3 {
	
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

	public void soma() {
		System.out.printf("\nSoma dos 3 valores = %d", num1+num2+num3);
	}
	public void media() {
		System.out.printf("\nMedia dos valores = %d", (num1+num2+num3)/3);
	}
	public void produto() {
		System.out.printf("\nProduto dos valores = %d", num1*num2*num3);
	}
	
	public void maiorValor() {
		if((num1>num2)&&(num1>num3)) {
			System.out.printf("\nMaior valor = %d", num1);}
		else if((num2>num1)&&(num2>num3)) {
			System.out.printf("\nMaior valor = %d", num2);}
		else  {
			System.out.printf("\nMaior valor = %d", num3);}
	}
	
	public void menorValor() {
		if((num1<num2)&&(num1<num3)) {
			System.out.printf("\nMenor valor = %d", num1);}
		else if((num2<num1)&&(num2<num3)) {
			System.out.printf("\nMenor valor = %d", num2);}
		else {
			System.out.printf("\nMenor valor = %d", num3);}
	}
}
