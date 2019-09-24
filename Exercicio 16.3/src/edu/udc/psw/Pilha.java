package edu.udc.psw;

public class Pilha {

	NoPilha topo;

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
		/* Verificação de existência de nós na pilha */
		if (tamanho == 0) return true;
		else return false;
	}

	public boolean push(Object obj) { /* Inserir no topo da pilha */
		NoPilha n = new NoPilha(obj);

		/* Verificar se a pilha é vazia ou não */
		if (tamanho == 0) {
			topo = n;
			n.anterior = null;

			tamanho++;
			return true;
		}

		else {
			n.anterior = topo;
			topo = n;

			tamanho++;
			return true;
		}

	}

	public NoPilha pop() { /* Remover do topo da pilha */
		
		/* Verificar a existência de nós no topo da pilha*/
		if (tamanho > 0) { 
			NoPilha n = topo;
			topo = n.anterior;

			tamanho--;
			return n;
		}

		/* Pilha vazia */
		else return null;
	}
}
