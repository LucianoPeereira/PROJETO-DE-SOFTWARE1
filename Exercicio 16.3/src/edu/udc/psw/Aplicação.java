package edu.udc.psw;

import java.util.Scanner;

public class Aplica��o {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
	      System.out.println("Entre com um n�mero:");
	      int valor = entrada.nextInt();

	      Pilha novaPilha = new Pilha();

	      novaPilha.push(valor);
	      novaPilha.push(70);
	      novaPilha.push(88);
	      System.out.println("Item de valor " + novaPilha.pop() + " retirado da pilha");
	      System.out.println("Item restante: " + novaPilha.peek());
	      System.out.println("Item de valor " + novaPilha.pop() + " retirado da pilha");
	      System.out.println("Item restante: " + novaPilha.peek()); 
	   }

}
