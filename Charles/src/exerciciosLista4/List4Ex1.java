package exerciciosLista4;

import java.util.Scanner;

public class List4Ex1 {
	public static void main(String[] args) {

		//Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("\nDigite tr�s n�meros inteiros e o sistema dir� qual deles � maior,\nPrimeiro n�mero: ");
		int n1 = sc.nextInt();

		System.out.println("\n Digite o segundo n�mero: ");
		int n2 = sc.nextInt();

		System.out.println("\n Digite o terceiro n�mero: ");
		int n3 = sc.nextInt();

		if ((n1 > n2) && (n1 > n3)) {
			System.out.println("\nO n�mero " + n1 + " � o maior  ");
		} else if ((n2 > n1)&&(n2 > n3)) {
			System.out.println("\nO n�mero " + n2 + " � o maior  ");
		} else if ((n3 > n1)&&(n3 > n2)) {
			System.out.println("\nO n�mero " + n3 + " � o maior  ");
		}
			

		if ((n1 == n2)&&(n3==n2)) {
			System.out.println("\nOs n�meros " + n1 + " e " + n2 +" e "+ n3 + " s�o iguais");
		}

	}

}
