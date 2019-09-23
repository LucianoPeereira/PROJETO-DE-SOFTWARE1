package edu.udc.psw.aplicação;

import edu.udc.psw.ListaEncadeada;
import edu.udc.psw.Ponto2D;

public class Aplicação {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();

			lista.inserirInicio(new Ponto2D(1, 2));
			lista.inserirInicio(new Ponto2D(3, 4));
			lista.InserirMeio(new Ponto2D(5, 6), 2);
			lista.inserirFim(new Ponto2D(7, 8));
			lista.inserirFim(new Ponto2D(9, 10));
			lista.inserirFim(new Ponto2D(11, 12));
			lista.inserirFim(new Ponto2D(13, 14));
			lista.inserirFim(new Ponto2D(15, 16));
			
			
			System.out.println("Pesquisa" + lista.pesquisar(2));
			lista.remover(2);
			


			System.out.println("Tamanho Lista: " + lista.getTamanho());
			for (int i = 1; i <= lista.getTamanho(); i++) {
				System.out.println(i + " - " + lista.pesquisar(i));
			}
		}
}
