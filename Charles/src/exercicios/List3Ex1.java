package exercicios;

import java.util.Scanner;

public class List3Ex1 {

	public static void main(String[] args) {
		
//		Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nDigite dois n�meros e o sistema dir� qual deles � maior,\nPrimeiro n�mero: ");
		double n1 = sc.nextDouble();
		
		System.out.println("\n Digite o segundo n�mero: ");
		double n2 = sc.nextDouble();
		
		if (n1 > n2) {
			System.out.println("\nO n�mero " + n1 + " � maior que o n�mero " + n2);
		}
		
		if (n1 < n2) {
			System.out.println("\nO n�mero " + n2 + " � maior que o n�mero " + n1);
		}
		
		if (n1 == n2) {
			System.out.println("\nOs n�meros "+ n1 +" e "+ n2 + " s�o iguais");
		}
		
		
		
	}

}
