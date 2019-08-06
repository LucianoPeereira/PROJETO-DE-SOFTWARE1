package edu.udc.psw;

import java.util.Scanner;

public class Primo_6{
		
	private int num1;
	int contador = 0;
    
    void lerDados() {
    	Scanner sc = new Scanner (System.in);
    	do {
			System.out.print("Digite um número válido: ");
			num1 = sc.nextInt();
		}while (num1 <= 0);
    }
    
	 public void Primo () {
		for (int i = 2; i < num1; i++) {
	        if (num1 % i == 0) {
	        	System.out.printf("\nNUMERO %d NAO PRIMO\n",num1);
	        	return;
	        }
		} 
	    	System.out.printf("\nNUMERO %d PRIMO\n",num1);
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}
}