package Colecao;

public interface IteradorAbstrato<E> {
	public boolean proximo();
	public boolean anterior();
	public E dadoAtual();
}