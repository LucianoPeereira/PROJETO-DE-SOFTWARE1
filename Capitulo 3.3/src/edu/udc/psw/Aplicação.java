package edu.udc.psw;

public class Aplicação {

	public static void main(String[] args) {
		TipoTriangulo eq = new TipoTriangulo(2, 2, 2);
		System.out.println(eq.Tipo());
		
		TipoTriangulo i = new TipoTriangulo(2, 2, 4);
		System.out.println(i.Tipo());
		
		TipoTriangulo e = new TipoTriangulo(2, 3, 4);
		System.out.println(e.Tipo());
		

	}

}
