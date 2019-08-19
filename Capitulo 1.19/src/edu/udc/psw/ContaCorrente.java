package edu.udc.psw;

public class ContaCorrente {
	
	Movimentação mov[] = new Movimentação[100];
	private int j; //Indice Movimentação
	
	private int Id;
	private Double Saldo;
	private int Especial;
	private Double Limite;
	
	public ContaCorrente() {
		Limite = 600.0;
	}

	public ContaCorrente(int id, Double saldo, int i) {
		this.Id = id;
		this.Saldo = saldo;
		this.Especial = i;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Double getSaldo() {
		return Saldo;
	}

	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}

	public int getEspecial() {
		return Especial;
	}

	public void setEspecial(int especial) {
		Especial = especial;
	}

	public Double getLimite() {
		return Limite;
	}

	public void setLimite(Double limite) {
		Limite = limite;
	}
	
	public void Movimenta() {
		
	}

}
