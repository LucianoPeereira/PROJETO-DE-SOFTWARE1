package edu.udc.psw;

public class NoPilha {

	NoPilha anterior;
	Object obj;

	/* Construtores */

	NoPilha(){
		this.anterior = null;
		this.obj = null;
	}

	NoPilha(Object obj){
		this.anterior = null;
		this.obj = obj;
	}

	NoPilha(NoPilha anterior, Object obj){
		this.anterior = anterior;
		this.obj = obj;
	}
}
