package exercicios;

import java.util.Scanner;

public class List3Ex2 {

	public static void main(String[] args) {
		
		/*
		 * Faça um Programa que peça um valor e mostre na tela 
		 * se o valor é positivo ou negativo.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer: \n");
		double num = sc.nextDouble();
		
		if(num >= 0) {
			System.out.println("\nO número " + num + " é positivo" );
		}
		
		if (num < 0) {
			System.out.println("\nO número " + num + " é negativo" );
		}
	}

}
