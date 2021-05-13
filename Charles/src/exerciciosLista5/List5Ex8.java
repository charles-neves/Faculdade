package exerciciosLista5;

import java.util.Scanner;

public class List5Ex8 {

	public static void main(String[] args) {
		// Elabore um programa que receba 
		// 5 n�meros e imprima somente os positivos.
		
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int num = 0;
			
		System.out.println("Digite 5 n�meros inteiros.");
		while (i <= 5) {
			System.out.println("\ndigite o "+i+"� n�mero inteiro ");
			num = sc.nextInt();
			if (num >= 0) {
				System.out.println("\n"+num+" � um n�mero positivo ");
			} 
			i++;
		}
		System.out.println("Os cinco n�meros foram digitados e processados, obrigado!");
	}

}
