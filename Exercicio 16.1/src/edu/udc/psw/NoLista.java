package edu.udc.psw;

public class NoLista {
	NoLista proximo;
	NoLista anterior;
	Object dado;
	
	NoLista() { //Visibilidade apenas no pacote
		this.proximo = null;
		this.anterior = null;
		this.dado = null;
	}
	
	NoLista(NoLista proximo, NoLista anterior, Object obj) {
		this.proximo = proximo;
		this.anterior = anterior;
		this.dado = obj;
	}
	
}
