package exercicios;

import java.util.Scanner;

public class List1Ex1 {

	public static void main(String[] args) {
		
		/*  1. Faça um algoritmo que leia a idade de uma
		 *  pessoa expressa em anos, meses e dias e 
		 *  mostre-a expressa em dias. Leve em 
		 *  consideração o ano com 365 dias e o 
		 *  mês com 30. 
		 *  (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu Nome: ");
		String name = sc.next();
		
		System.out.println(name + ", digite sua idade completa separando "
				+ "por anos, meses e dias");
		System.out.println("Quantos anos?");
		int anos = sc.nextInt();
		System.out.println("Quantos meses?");
		int meses = sc.nextInt();
		System.out.println("Quantos dias?");
		int dias = sc.nextInt();
		
		int diasAnos = anos * 365;
		int diasMeses = meses * 30;
		int totalDias = dias + diasMeses + diasAnos;
		
		System.out.println( name + " podemos dizer então que você tem "
				+ totalDias + " dias de vida.");
		
		System.out.println("----------------------------------------------------------------");
		
		
		
		
		
	}

}
