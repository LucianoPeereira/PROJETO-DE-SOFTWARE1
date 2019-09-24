package edu.udc.psw;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data() {
		setDia(0);
		setMes(0);
		setAno(0);
	}

	public void iniciaData(int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia > 0 && dia <= 31)
			this.dia = dia;
		else
			this.dia = 0;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes > 0 && mes < 13)
			this.mes = mes;
		else
			this.mes = 0;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > 0)
			this.ano = ano;
		else
			this.ano = 0;
	}

	void mostrarData() {
		if (dia > 0 && mes > 0 && ano > 0)
			System.out.printf("%d de %s de %d\n", dia, mesExtenco(mes), ano);
		else
			System.out.printf("Data Invalida\n");
	}

	String mesExtenco(int mes) {
		switch (mes) {
		case 1:
			return "Janeiro";
		case 2:
			return "Feverreiro";
		case 3:
			return "Março";
		case 4:
			return "Abril";
		case 5:
			return "Maio";
		case 6:
			return "Junho";
		case 7:
			return "Julho";
		case 8:
			return "Agosto";
		case 9:
			return "Setembro";
		case 10:
			return "Outubro";
		case 11:
			return "Novembro";
		case 12:
			return "Dezembro";

		}
		return null;

	}

	public boolean eIgual(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (ano != other.ano)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	protected Data clone() {
		Data data = new Data();
		data.dia = dia;
		data.mes = mes;
		data.ano = ano;
		return data;
	}

	boolean vemAntes() {
		if (equals(clone()))
			return true;
		return false;
	}

	void dataEValida() {
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia > 0 && dia <= 31)
				System.out.printf("Dia valido\n");
		}
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			if (dia > 0 && dia < 31)
				System.out.printf("Dia valido\n");
		}
		if (mes == 2) {
			if ((ano % 4) == 0 && (ano % 100) != 0 && (ano % 400) == 0) {
				if (dia > 0 && dia <= 29)
					System.out.printf("Dia valido\n");
			} else if (dia > 0 && dia < 29)
				System.out.printf("Dia valido\n");
		} else
			System.out.printf("Dia invalido\n");
		if (mes > 0 && mes < 13)
			System.out.printf("Mes valido\n");
		else
			System.out.printf("Mes invalido\n");
		if (ano > 0)
			System.out.printf("Ano valido\n");
		else
			System.out.printf("Ano invalido\n");
	}

}