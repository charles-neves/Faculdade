package exerciciosLista4;

import java.util.Scanner;

public class List4Ex3 {
	public static void main(String[] args) {

		//Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
		
		Scanner sc = new Scanner(System.in);

		System.out.println("\nDigite tr�s n�meros inteiros e o sistema dir� \nqual deles � o maior e qual � o menor,\nPrimeiro n�mero: ");
		int n1 = sc.nextInt();

		System.out.println("\n Digite o segundo n�mero: ");
		int n2 = sc.nextInt();

		System.out.println("\n Digite o terceiro n�mero: ");
		int n3 = sc.nextInt();

		//n1>
		if ((n1 > n2) && (n1 > n3) && (n3 >= n2)) {
			System.out.println("\nO n�mero " + n1 + " � o maior e " + n2 +" � o menor");
		}
		else if ((n1 > n2)&&(n1 > n3) && (n2 >= n3)) {
			System.out.println("\nO n�mero " + n1 + " � o maior e " + n3 +" � o menor");
		}
		//n2>
		else if ((n2 > n1)&&(n2 > n3) && (n3 >= n1)) {
			System.out.println("\nO n�mero " + n2 + " � o maior e " + n1 +" � o menor");
		}
		else if ((n2 > n1)&&(n2 > n3) && (n1 >= n3)) {
			System.out.println("\nO n�mero " + n2 + " � o maior e " + n3 +" � o menor");
		}
		//n3>
		else if ((n3 > n1)&&(n3 > n2) && (n2 >= n1)) {
			System.out.println("\nO n�mero " + n3 + " � o maior e " + n1 +" � o menor");
		}
		else if ((n3 > n1)&&(n3 > n2) && (n1 >= n2)) {
			System.out.println("\nO n�mero " + n3 + " � o maior e " + n2 +" � o menor");
		}
			

		if ((n1 == n2)&&(n3==n2)) {
			System.out.println("\nOs n�meros " + n1 + " e " + n2 +" e "+ n3 + " s�o iguais");
		}

	}

}
