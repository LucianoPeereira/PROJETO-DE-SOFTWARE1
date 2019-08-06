package edu.udc.psw;

import java.util.Scanner;

public class Separador_5 {
	
	int valorUsuario = 0; 
	int quinto= 0;
	int quarto = 0;
	int terceiro = 0;
	int segundo = 0;
	int primeiro = 0;
	
	void lerDados() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("\nEntre com 3 valores");
		valorUsuario = sc.nextInt();
	}

	public void separador () {
		quinto = valorUsuario%10; valorUsuario /= 10;
		quarto = valorUsuario % 10; valorUsuario /= 10;
		terceiro = valorUsuario % 10; valorUsuario /= 10;
		segundo = valorUsuario % 10; valorUsuario /= 10;
		primeiro = valorUsuario % 10;
	
		System.out.printf("\n%d   %d   %d   %d   %d\n",primeiro, segundo, terceiro, quarto, quinto);
   
	}
}

