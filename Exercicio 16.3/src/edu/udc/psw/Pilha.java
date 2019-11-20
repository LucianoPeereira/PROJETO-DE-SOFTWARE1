package edu.udc.psw;

import java.util.Iterator;

import Colecao.IteradorAbstrato;

public class Pilha <E> implements Iterable<E>{

	private class NoLista {
		NoLista proximo;
		E obj;

		NoLista(){
			this.proximo = null;
			this.obj = null;
		}

		NoLista(E obj){
			this.proximo = null;
			this.obj = obj;
		}
	}

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
			return false;
		}

		@Override
		public E dadoAtual() {
			if(noAtual == null)
				return null;
			return noAtual.obj;
		}

	}


	private class IteradorJava implements Iterator<E> {
		private NoLista noAtual;
		private NoLista noAnterior;

		IteradorJava(NoLista no) {
			noAtual = no;
			noAnterior = new NoLista();
			noAnterior.proximo = no;
		}

		@Override
		public boolean hasNext(){
			if(noAtual.proximo == null)
				return false;

			return true;
		}

		@Override
		public E next(){
			if(noAtual.proximo == null){
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
			if (noAtual != null){
				noAnterior.proximo = noAtual.proximo;

				noAtual = null;
			}
		}

	}

	/* Objetos */

	NoLista topo;

	int tamanho;

	/* Construtores */

	public Pilha() {
		topo = null;

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
		Iterador it = new Iterador(topo);
		return it;
	}
	
	public IteradorAbstrato<E> getIteradorFim() {
		return new Iterador(topo);
	}

	public Iterator<E> iterator(){
		return new IteradorJava(topo);
	}

	public boolean push(E obj) {

		NoLista n = new NoLista(obj);
		
		/* Primeira inserção */
		if (tamanho == 0) { 

			topo = n;

			tamanho++;
			return true;
		}

		/* Inserção no topo da pilha */
		else { 
			
			n.proximo = topo;			
			topo = n;

			tamanho++;
			return true;
		}

	}

	public boolean pop() {
		boolean flag = false; 

		if (tamanho == 0)
			return flag;

		/* Busca pela posição do objeto específico */
		else { 
			NoLista it = topo;
			
			/* Remoção em lista unitária */
			if (tamanho == 1) {
				topo = null;
			}

			/* Remoção do topo */
			else if (it == topo) {
				topo = topo.proximo;
			}

			tamanho--;
			flag = true;
		}

		return flag;

	}


}