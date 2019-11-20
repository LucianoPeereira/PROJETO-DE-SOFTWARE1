package Colecao;

public abstract class  FormaGeometrica {
	public abstract Ponto2D centro();
	public abstract float perimetro();
	public abstract float area();
	public abstract float largura();
	public abstract float altura();
	
	public float distancia(FormaGeometrica forma){
		return centro().distancia(forma.centro());
	}
	
	public String ObjectToString() {
		return super.toString();
	}
}