package edu.udc.psw;

public class Aplicação {

	public static void main(String[] args) {
		int i = 0;
		System.out.printf("For\n");
		for (i = 150; i <= 300; i++) {
			System.out.println(i);
		}

		i = 0;
		System.out.printf("\nWhile\n");
		while (i <= 1000) {
			System.out.println(i++);
		}

		System.out.printf("\nMultiplo de 3 - For\n");
		for (i = 1000; i <= 1200; i = i + 3) {
			System.out.println(i);
		}

		System.out.printf("\nMultiplo de 3 - While\n");
		i = 1000;
		while (i <= 1200) {
			i = i + 3;
			System.out.println(i);
		}

		System.out.printf("\nMultiplo de 3 - Do While\n");
		i = 1000;
		do {
			i = i + 3;
			System.out.println(i);
		} while (i <= 1200);

		//POR QUE?
		//O tipo primitivo int possui suporta uma quantidade de valores, tanto positiva
		//quanto negativa, quando excedida a parte possitiva, a parte negativa e usada
		System.out.printf("\nFatorial\n");
		long fat = 1;
		for (long j = 2; j <= 20; j++) {
			fat *= j;
			System.out.println(fat);
		}
		
		System.out.printf("\nFibonacci\n");
		for (long k = 0; k < 100; k++) {
			System.out.print("\n" + k + ":" + Fibonacci.fibo(k));
		}

	}

	public static class Fibonacci {

		static long fibo(long n) {
			long F = 0; // atual
			long ant = 0; // anterior

			for (long i = 1; i <= n; i++) {
				if (i == 1) {
					F = 1;
					ant = 0;
				} else {
					F += ant;
					ant = F - ant;
				}

			}
			return F;
		}
	}	
}