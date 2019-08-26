package xisMais;

public class XisMais {

	int valor;
	String[][] matriz;

	XisMais(int valor) {
		matriz = new String[valor][valor];
		this.valor = valor;
	}

	public void FazX() {

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				if(x == ((valor-1)/2))
					matriz[x][y] = "*";
				else if(y == ((valor-1)/2))
					matriz[x][y] = "*";
				else if (x == y)
					matriz[x][y] = "*";
				else if (x + y == valor - 1)
					matriz[x][y] = "*";
				else
					matriz[x][y] = "_";
			}
		}
	}

	public void ImprimeX() {
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {

				System.out.printf("%s ", matriz[x][y]);
			}
			System.out.println();
		}
	}

}
