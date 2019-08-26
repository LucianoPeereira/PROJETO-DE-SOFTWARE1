package xisMais;

import java.util.Scanner;

public class Leitura {

	Scanner sc = new Scanner(System.in);
	
	public int lerDados() {
		System.out.printf("Entre com um valor impar entre 7 e 35: \n");
		return sc.nextInt();
	}
	
}
