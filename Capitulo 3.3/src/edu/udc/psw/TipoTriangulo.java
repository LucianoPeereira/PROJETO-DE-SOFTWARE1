package edu.udc.psw;

public class TipoTriangulo {

	int A;
	int B;
	int C;
	
	public TipoTriangulo(int A, int B, int C) {
		this.A = A;
		this.B = B;
		this.C = C;
		
	}

	String Tipo(){
		if(A == B && B == C)
			return "Equil�tero";
		
		else if(A == B && A != C)
			return "Is�celes";
		else if(A == C && A != B)
			return "Is�celes";
		
		return "Escaleno";
	}
	
	
}
