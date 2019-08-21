package edu.udc.psw;

public class TesteFatura {

	public static void main(String[] args) {
		Fatura Fat = new Fatura("0001", "Detergente", 4, -1);

		System.out.println("Produto: " + Fat.getDescricao() + "\nFatura: " + Fat.getTotalFatura());
	}

}
