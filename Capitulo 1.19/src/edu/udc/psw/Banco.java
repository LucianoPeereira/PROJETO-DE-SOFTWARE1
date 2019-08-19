package edu.udc.psw;

import java.util.Scanner;

public class Banco {
	private int i; //Indice Conta Corrente
	
	Scanner sc = new Scanner(System.in);
	
	ContaCorrente obj[] = new ContaCorrente[10];
	
	
	void CriarConta() {
		System.out.printf("\nNumero da conta : %d", i++);
		obj[i].setId(sc.nextInt());
		System.out.printf("Conta Especial? 1/Y  - 0/N");
		obj[i].setEspecial(sc.nextInt());
	}
	
	void ExcluirConta(int i) {
		System.out.printf("\nConta disponiveis %d", i);
		for(int x = i; x<=i; x--) {
			System.out.printf("\nId: %d\n Especial: %d\n Saldo: %f\n",obj[i].getId(), obj[i].getEspecial(), obj[i].getSaldo());
		}
	}
	
	void Saque(int i) {
		System.out.printf("\nEntre com o valor de saque:");
		double saque  = sc.nextDouble();
		
		if(obj[i].getLimite() > 0 && obj[i].getSaldo()<=0) {
			if(saque>obj[i].getLimite()) {
				return;
			}
			obj[i].setLimite(obj[i].getLimite()-saque);
			//obj[i].
		}
			
		else if(obj[i].getLimite() <= 0 && obj[i].getSaldo()>0) {
			if(saque>obj[i].getSaldo()) {
				return;
			}
			obj[i].setLimite(obj[i].getLimite()-saque);	
		}		
	}
	
	void Deposito(int i) {
		System.out.printf("\nEntre com o valor para deposito:");
		double deposito  = sc.nextDouble();
		
		obj[i].setSaldo(obj[i].getSaldo()+deposito);
	}
	
	void EmissãoDeSaldo(int i) {
		System.out.print(obj[i].getSaldo());
	}
	
	void Extrato() {
	}
	
	void Transferencia() {
	}
}
