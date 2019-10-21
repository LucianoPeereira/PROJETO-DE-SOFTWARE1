package colecao;

//Iterator<T> JAVA 7
//boolean hasNext() -> Existe Proximo no? V/F
//T next() Desloca para o proximo no e retorno o dado
//void remove() remove o ultimo elemento retornado (resultado do next())

public interface IteradorAbstrato<TIPO> {
	public boolean proximo();
	public boolean anterior();
	public TIPO dadoAtual();
}
