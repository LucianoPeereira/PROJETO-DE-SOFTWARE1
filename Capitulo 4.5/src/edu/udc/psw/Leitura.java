package edu.udc.psw;

import java.util.Scanner;

public class Leitura {

	Scanner sc = new Scanner(System.in);
	
	public int lerDados() {
		System.out.printf("Entre com um valor impar entre 3 e 15: \n");
		return sc.nextInt();
	}
	
}
