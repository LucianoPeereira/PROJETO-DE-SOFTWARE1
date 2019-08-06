package edu.udc.psw;

public class Exercicio1 {
	
	void Soma(int num1,int num2) {
		System.out.printf("Soma dos valores = %d\n", num1+num2);
	}
	
	void Diferenca(int num1, int num2) {
		if(num1>num2) {
			System.out.printf("Diferença dos valores e = %d", num1-num2);
		}
		else
			System.out.printf("Diferença dos valores e = %d", num2-num1);
	}
}
