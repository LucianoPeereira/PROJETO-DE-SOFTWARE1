package edu.udc.psw;

public class Fatura {

	private String Codigo_prod;
	private String Descricao;
	private int Quantidade;
	private double item;
	double Fatura;
	
	public Fatura(String codigo_prod, String descricao, int quantidade, double item) {
		Codigo_prod = codigo_prod;
		Descricao = descricao;
		Quantidade = quantidade;
		setItem(item);
	}
	
	public String getCodigo_prod() {
		return Codigo_prod;
	}
	public void setCodigo_prod(String codigo_prod) {
		Codigo_prod = codigo_prod;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	public double getItem() {
		return item;
	}
	public void setItem(double item) {
		if(item<=0)
			this.item = 0;
		else
			this.item = item;
	}
	
	double getTotalFatura() {
		if(getItem()<0)
			return 0;
		return  getQuantidade()*getItem();
	}
	
}
