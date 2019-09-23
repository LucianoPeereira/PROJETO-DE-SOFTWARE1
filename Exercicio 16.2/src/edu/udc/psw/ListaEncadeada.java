package edu.udc.psw;

import edu.udc.psw.ListaEncadeada.IteradorConcreto;

public class ListaEncadeada {
	
	public class IteradorConcreto implements Iterador {
		NoLista noAtual;
		
		IteradorConcreto(NoLista noAtual){
			this.noAtual = noAtual;
		}
		
		public Object getDado() {
			if(noAtual == null)
				return null;
			return noAtual.dado;
		}

		public Object proximo() {
			if(noAtual == null)
				return null;
			Object obj = noAtual.dado;
			noAtual = noAtual.proximo;
			return obj;
		}

		public Object anterior() {
			if(noAtual == null) //Teste de lista vazia
				return null;
			Object obj = noAtual.dado;
			noAtual = noAtual.anterior;
			return obj;
		}
	}
	
	public class NoLista {
		NoLista proximo;
		NoLista anterior;
		Object dado;
	}
	
	private NoLista inicio;
	private NoLista fim;

	private int tamanho;

	public Iterador getInicio() {
		Iterador i = new IteradorConcreto(inicio);
		return i;
	}
	
	public Iterador getFim() {
		return new IteradorConcreto(fim);
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void inserirInicio(Object obj) { // Insere no inicio
		NoLista novo = new NoLista();
		
		novo.dado = obj;
		novo.proximo = inicio;
		novo.anterior = null;

		if (inicio == null) { // Lista Vazia
			inicio = novo;
			fim = novo;
		} else { // Novo inicio
			inicio.anterior = novo;
			inicio = novo;
		}
		tamanho++;
	}

	public void InserirMeio(Object obj, int pos) { // Insere em qualquer posição
		if (pos < 1 || pos > tamanho + 1)
			return;

		NoLista novo = new NoLista();
		
		
		NoLista aux = inicio;
		int contador = 1;

		novo.dado = obj;
		novo.proximo = null;
		novo.anterior = null;

		while (contador < pos) {
			aux = aux.proximo;
			contador++;
		}

		novo.anterior = aux.anterior;
		novo.proximo = aux;

		aux.anterior.proximo = novo;
		aux.anterior = novo;

		tamanho++;
	}

	public void inserirFim(Object obj) { // Insere no fim
		NoLista novo = new NoLista();

		novo.dado = obj;
		novo.proximo = null;
		novo.anterior = fim;

		if (fim != null)// Insere no fim;
			fim.proximo = novo;

		fim = novo;

		if (inicio == null) // Lista Vazia
			inicio = novo;

		tamanho++;
	}

	public void remover(int pos) { // Remove item por posição

		if(tamanho == 1 && pos == 0) { //remover o unico elemento da lista
			inicio = null;
			fim = null;
			tamanho--;
			return;
		}
		
		if(pos == 0) { //remover o inicio
			inicio = inicio.proximo;
			inicio.anterior = null;
			tamanho--;
			return;
		}
		
		if(pos == tamanho-1) { //remover o ultimo elemento
			fim = fim.anterior;
			fim.proximo = null;
			tamanho--;
			return;
		}
		
		if(pos > 1 && pos <tamanho-1) {
		
		NoLista iterador = inicio;
		int contador = 1;

		while (contador < pos) {
			iterador = iterador.proximo;
			contador++;
		}

		iterador.anterior.proximo = iterador.proximo;
		iterador.proximo.anterior = iterador.anterior;
		tamanho--;
		}
	}

	public boolean remover(Object obj) {
		
		NoLista iterador = inicio;
		boolean removido = false;

		while (iterador != null) {
			
			if(iterador.dado.equals(obj)) {
				if(tamanho == 1) { //unico elemento
					inicio = null;
					fim = null;
				}
				else if(iterador == inicio) { //primeiro elemento
					inicio = inicio.proximo;
					inicio.anterior = null;
				}
				else if(iterador == fim) { //ultimo elemento
					fim = fim.anterior;
					fim.proximo = null;
				}
				else {
					iterador.anterior.proximo = iterador.proximo;
					iterador.proximo.anterior = iterador.anterior;
				}
				removido = true;
				tamanho --;
		}
			iterador = iterador.proximo;
	}
		return removido;	
}

	public Object pesquisar(int pos) {
		NoLista auxiliar = inicio;
		int cont = 1;

		if (tamanho == 0)
			return null;

		if (pos > tamanho)
			return null;

		while (cont < pos) {
			auxiliar = auxiliar.proximo;
			cont++;
		}

		return auxiliar.dado;
	}
}

