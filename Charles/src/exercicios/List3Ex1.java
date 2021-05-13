package exercicios;

import java.util.Scanner;

public class List3Ex1 {

	public static void main(String[] args) {
		
//		Faça um Programa que peça dois números e imprima o maior deles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite dois números e o sistema dirá qual deles é maior,\nPrimeiro número: ");
		double n1 = sc.nextDouble();
		
		System.out.println("\n Digite o segundo número: ");
		double n2 = sc.nextDouble();
		
		if (n1 > n2) {
			System.out.println("\nO número " + n1 + " é maior que o número " + n2);
		}
		
		if (n1 < n2) {
			System.out.println("\nO número " + n2 + " é maior que o número " + n1);
		}
		
		if (n1 == n2) {
			System.out.println("\nOs números "+ n1 +" e "+ n2 + " são iguais");
		}
		
		
		
	}

}
