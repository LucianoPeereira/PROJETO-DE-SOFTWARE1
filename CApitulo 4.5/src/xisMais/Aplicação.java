package xisMais;

public class Aplica��o {

	public static void main(String[] args) {
		
		Leitura ler = new Leitura();
		XisMais x = new XisMais(ler.lerDados());
		
		x.FazX();
		x.ImprimeX();
		
		
	}

}
