package edu.udc.psw;

public class Fila {
	NoFila inicio;
	NoFila fim;

	int tamanho;

	/* Construtores */

	public Fila() {
		inicio = null;
		fim = null;

		tamanho = 0;
	}

	/* Getters e Setters */

	public int getTamanho() { return tamanho; }

	/* Métodos */

	public boolean isVazia() { 
		/* Verificação de existência de nós na fila */
		if (tamanho == 0) return true;
		else return false;
	}

	public boolean queue(Object obj) { /* Inserir no começo da fila */
		NoFila n = new NoFila(obj);

		/* Caso a fila esteja vazia */
		if (tamanho == 0) { 
			inicio = n;
			fim = n;

			tamanho++;
			return true;
		}

		else {
			inicio.anterior = n;
			inicio = n;
			n.anterior = null;

			tamanho++;
			return true;
		}
	}

	public NoFila dequeue() {

		/* Verificar a existência de nós na fila */
		if (tamanho > 0) {
			NoFila n = fim;
			fim = n.anterior;

			tamanho--;
			return n;
		}

		/* Fila vazia */
		else return null;
	}
}
