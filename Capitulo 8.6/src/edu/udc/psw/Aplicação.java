package edu.udc.psw;

import java.util.Scanner;

public class Aplicação {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Pessoa A = new Pessoa();
		Aluno B = new Aluno();
		Funcionario C = new Funcionario();
		Servente D = new Servente();
		Professor E = new Professor();
		Diretor F = new Diretor();
		
		System.out.println("Entre com o nome");
		A.setNome(sc.next());
		System.out.println(A.toString());
		
		System.out.println("Entre com o nome: ");
		B.setNome(sc.next());
		System.out.println("Entre com o Curso: ");
		B.setCurso(sc.next());
		System.out.println("Entre com a serie: ");
		B.setSerie(sc.next());
		System.out.println(B.toString());
		
		System.out.println("Entre com o nome: ");
		C.setNome(sc.next());
		System.out.println("Entre com o Numero de Registro: ");
		C.setNome(sc.next());
		System.out.println("Entre com o salario: ");
		C.setSalario(sc.nextFloat());
		System.out.println("Entre com a data de Admissão:  ");
		C.setData_Admissao(sc.next());
		System.out.println(C.toString());
		
		System.out.println("Entre com o nome: ");
		D.setNome(sc.next());
		System.out.println("Entre com o Setor: ");
		D.setSetor(sc.next());
		System.out.println(D.toString());
		
		System.out.println("Entre com o nome: ");
		E.setNome(sc.next());
		System.out.println("Entre com a Disciplina: ");
		E.setDisciplina(sc.next());
		System.out.println(E.toString());
		
		System.out.println("Entre com o nome: ");
		F.setNome(sc.next());
		System.out.println("Entre com o Setor: ");
		F.setAno_mandato(sc.next());
		System.out.println(F.toString());
	}

}
