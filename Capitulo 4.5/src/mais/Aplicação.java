package mais;

public class Aplica��o {

	public static void main(String[] args) {
		
		Leitura ler = new Leitura();
		mais x = new mais(ler.lerDados());
		
		x.FazMais();
		x.ImprimeMais();
		
		
	}

}
