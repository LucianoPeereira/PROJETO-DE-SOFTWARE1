package losango;

public class losango {

	int valor;
	String[][] matriz;

	losango(int valor) {
		matriz = new String[valor][valor];
		this.valor = valor;
	}

	public void FazMais() {

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				if(x + y== (valor-4))
					matriz[x][y] = "*";
				else if(x - y== (valor-4))
					matriz[x][y] = "*";
//				else if(x-y == ((valor+2)))
//					matriz[x][y] = "*";
				else if(x+y == ((valor+2)))
					matriz[x][y] = "*";
				else
					matriz[x][y] = "_";
			}
		}
	}

	public void ImprimeMais() {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {

				System.out.printf("%s ", matriz[x][y]);
			}
			System.out.println();
		}
	}

}
