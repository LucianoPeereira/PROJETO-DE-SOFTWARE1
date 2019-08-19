package udc.edu.psw;

public class Aplicação {

	public static void main(String[] args) {
		
		Ponto p1 = new Ponto(1,1);
		Ponto p2 = new Ponto(3,5);
		Ponto p3 = new Ponto(4,2);
		
		System.out.printf("P1 = %.2f\n", p1.distancia(p2));
		System.out.printf("P2 = %.2f\n", p2.distancia(p3));
		System.out.printf("P3 = %.2f\n", p3.distancia(p1));

		TrianguloRetangulo T = new TrianguloRetangulo(p1,p2,p3);
		System.out.printf("Comprimento = %.2f\n", T.comprimento());
		System.out.printf("Altura = %.2f\n", T.altura());
		System.out.printf("Area = %.2f\n", T.area());
		System.out.printf("Perimetro = %.2f\n", T.perimetro());
		

	}
}
