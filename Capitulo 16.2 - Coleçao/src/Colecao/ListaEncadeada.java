package Colecao;

import java.util.Iterator;

public class ListaEncadeada<E> implements Iterable<E> {
	
	/* Classe privativa NoLista */

	private class NoLista {
		NoLista proximo;
		NoLista anterior;
		E obj;

		/* Construtores */

		NoLista(){
			this.proximo = null;
			this.anterior = null;
			this.obj = null;
		}

		NoLista(E obj){
			this.proximo = null;
			this.anterior = null;
			this.obj = obj;
		}

		NoLista(NoLista proximo, NoLista anterior, E obj){
			this.proximo = proximo;
			this.anterior = anterior;
			this.obj = obj;
		}
	}

	/* Classe privativa Iterador */

	private class Iterador implements IteradorAbstrato<E> {
		private NoLista noAtual;

		Iterador(NoLista no) {
			noAtual = no;
		}

		@Override
		public boolean proximo() {
			if(noAtual == null)
				return false;

			noAtual = noAtual.proximo;
			return true;
		}

		@Override
		public boolean anterior() {
			if(noAtual == null)
				return false;

			noAtual = noAtual.anterior;
			return true;
		}

		@Override
		public E dadoAtual() {
			if(noAtual == null)
				return null;
			return noAtual.obj;
		}

	}

	/* Classe privativa derivada do Collection */

	private class IteradorJava implements Iterator<E> {
		private NoLista noAtual;
		private NoLista noAnterior;

		IteradorJava(NoLista no) {
			noAtual = no;
			noAnterior = new NoLista();
			noAnterior.proximo = noAtual;
		}

		@Override
		public boolean hasNext(){
			if(noAtual.proximo == null)
				return false;

			return true;
		}

		@Override
		public E next(){
			if(noAtual.proximo == null) {
				if (noAnterior.proximo == null)
				return null;
			
				else 
					noAtual = noAnterior.proximo;
			}
			
			else {
			noAnterior = noAtual;
			noAtual = noAtual.proximo;
			}
			
			return noAtual.obj;
		}
		@Override
		public void remove(){
			if(noAtual != null) {
				noAnterior.proximo = noAtual.proximo;
				
				noAtual.proximo.anterior = noAtual.anterior;
				noAtual.anterior.proximo = noAtual.proximo;
				
				noAtual = null;
			}
		}

	}

	/* Objetos */

	NoLista inicio;
	NoLista fim;

	int tamanho;

	/* Construtores */

	public ListaEncadeada() {
		inicio = null;
		fim = null;

		tamanho = 0;
	}

	/* Getters e Setters */

	public int getTamanho() { return tamanho; }

	/* Métodos */

	public boolean isVazia() { 
		/* Verificação de existência de nós na lista */
		if (tamanho == 0) return true;
		else return false;
	}

	public IteradorAbstrato<E> getIteradorInicio() {
		Iterador it = new Iterador(inicio);
		return it;
	}
	
	public IteradorAbstrato<E> getIteradorFim() {
		return new Iterador(fim);
	}

	public Iterator<E> iterator(){
		return new IteradorJava(inicio);
	}

	public boolean inserir(E obj, int pos) {

		NoLista n = new NoLista(obj);
		
		/* Primeira inserção */
		if (tamanho == 0) { 

			inicio = n;
			fim = n;

			tamanho++;
			return true;
		}

		/* Inserção no início da lista, parâmetro pos negativo ou zero */
		else if (pos <= 0) { 
			
			n.proximo = inicio;
			inicio.anterior = n;			
			inicio = n;

			tamanho++;
			return true;
		}

		/* Inserção no fim da lista, parâmetro pos superior ou igual ao tamanho */
		else if (pos >= tamanho) { 

			n.anterior = fim;
			fim.proximo = n;
			fim = n;

			tamanho++;
			return true;
		}

		/* Inserção na posição desejada */
		else if (tamanho > pos && pos > 0) { 
			
			NoLista it = inicio;

			for (int i = 0; i < pos; i++)
				it = it.proximo;

			n.proximo = it;
			n.anterior = it.anterior;
			it.anterior.proximo = n;
			it.anterior = n;

			tamanho++;
			return true;
		}

		else return false;

	}

	public boolean remover(E obj) {
		boolean flag = false; /* Variável para controle de remoção */

		/* Remoção em lista vazia */
		if (tamanho == 0)
			return flag;

		/* Busca pela posição do objeto específico */
		else { 
			NoLista it = inicio;
			

			for (int i = 0; i < tamanho; i++){
				
				if (obj.equals(it.obj)){
					
					/* Remoção em lista unitária */
					if (tamanho == 1) {
						inicio = null;
						fim = null;
					}

					/* Remoção do primeiro elemento */
					else if (it == inicio) {
						inicio = inicio.proximo;
						inicio.anterior = null;
					}

					/* Remoção do último elemento */
					else if (it == fim) {
						fim = fim.anterior;
						fim.proximo = null;
					}

					/* Remoção específica */
					else {
						it.proximo.anterior = it.anterior;
						it.anterior.proximo = it.proximo;
					}

					tamanho--;
					flag = true;
				}

				it = it.proximo;
			}
		}

		return flag;

	}
	
	public boolean remover(int pos) {
		
		/* Remoção em lista vazia */
		if (tamanho == 0)
			return false;

		/* Remoção em lista unitária */
		else if (tamanho == 1 && pos <= 0) {
			inicio = null;
			fim = null;

			tamanho--;
			return true;
		}

		/* Remoção do primeiro elemento */
		else if (pos <= 0) {
			inicio = inicio.proximo;
			inicio.anterior = null;

			tamanho--;
			return true;
		}

		/* Remoção do último elemento */
		else if (pos >= tamanho-1) {
			fim = fim.anterior;
			fim.proximo = null;

			tamanho--;
			return true;
		}

		/* Busca pela posição específica */
		else if (pos < tamanho-1 && pos > 0) {
			NoLista it = inicio;

			for (int i = 0; i < pos; i++)
				it = it.proximo;


			it.proximo.anterior = it.anterior;
			it.anterior.proximo = it.proximo;

			tamanho--;
			return true;

		}

		else return false;

	}

	public E pesquisar(int pos) {
		NoLista it = inicio;

		for (int i = 0; i < pos; i++)
			it = it.proximo;

		return it.obj;
	}

}
