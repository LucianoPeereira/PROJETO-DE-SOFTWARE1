package edu.udc.psw.coleção;

public interface IteradorAbstrato<E> {
	public boolean proximo();
	public boolean anterior();
	public E dadoAtual();
}