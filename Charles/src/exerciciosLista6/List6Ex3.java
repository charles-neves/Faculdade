package exerciciosLista6;

import java.util.Scanner;

public class List6Ex3 {

	public static void main(String[] args) {
		//     3. Fa�a um programa que leia 5 n�meros e 
		// informe a soma e a m�dia dos n�meros.

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int max = 5;
		int soma = 0;
		double media = 0;
		
		while(max >= 1) {
			System.out.println("Digite um n�mero");
			num = sc.nextInt();
			soma += num;
			max--;
		}
		
		media = (double)soma/5;
		
		System.out.println("\nA soma dos n�meros � " + soma );
		System.out.printf("\nA m�dia dos n�meros � %.2f", media);
	}

}
