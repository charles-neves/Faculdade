package exercicios;

import java.util.Scanner;

public class List3Ex2 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um Programa que pe�a um valor e mostre na tela 
		 * se o valor � positivo ou negativo.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero qualquer: \n");
		double num = sc.nextDouble();
		
		if(num >= 0) {
			System.out.println("\nO n�mero " + num + " � positivo" );
		}
		
		if (num < 0) {
			System.out.println("\nO n�mero " + num + " � negativo" );
		}
	}

}
