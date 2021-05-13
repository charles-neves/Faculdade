package exerciciosLista5;

import java.util.Scanner;

public class List5Ex9 {

	public static void main(String[] args) {
//		Elabore um programa que receba o nome e 4 notas 
//		de 10 alunos, calcule e exiba o resultado da 
//		m�dia na tela utilizando a estrutura de repeti��o.

		Scanner sc = new Scanner(System.in);
		int aluno = 1;
		String name="";
		int nota = 1;
		double ava = 0;
		double media = 0;
		
		
		System.out.println("Digite as notas de 10 alunos");
		while (aluno <= 10) {
			System.out.println("\ndigite o nome do "+aluno+"� aluno ");
			name = sc.next();
			while (nota <= 4) {
				System.out.println("\nDigite a "+nota+"� nota");
				ava = sc.nextDouble();
				media += ava;
				nota++;
			} 
			media = media / 4;
			System.out.printf("a m�dia de "+name+" �: %.2f",media);
			media=0;
			nota = 1;
			aluno++;
		}
		
	}

}
