package losango;

public class Aplica��o {

	public static void main(String[] args) {
		
		Leitura ler = new Leitura();
		losango x = new losango(ler.lerDados());
		
		x.FazMais();
		x.ImprimeMais();
		
		
	}

}
