package exercicios;

import java.util.Scanner;

public class List1Ex2 {

	public static void main(String[] args) {
		
/*  Fazer um programa que imprima a 
*   m�dia aritm�tica de 4 notas solicitadas. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as notas das provas matem�tica do segundo semestre");
		System.out.println("Prova 1");
		double nota1 = sc.nextDouble();
		System.out.println("Prova 2");
		double nota2 = sc.nextDouble();
		System.out.println("Prova 3");
		double nota3 = sc.nextDouble();
		System.out.println("Prova 4");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4 )/ 4;
		
		System.out.printf("A sua m�dia em Matem�tica esse semestre � %.2f", media);
		
		

	}

}
