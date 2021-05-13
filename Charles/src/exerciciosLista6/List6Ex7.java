package exerciciosLista6;

import java.util.Random;
import java.util.Scanner;

public class List6Ex7 {

	public static void main(String[] args) {
		// Desenvolva um algoritmo que receba a idade de vinte
		// pessoas e mostre a idade da pessoa mais nova.

		Scanner sc = new Scanner(System.in);
		
		
		String name = "";
		String nameMin = "";
		int max = 5;
		int idade = 0;
		int minima = 0;

		do {
			System.out.println("Digite o nome de uma pessoa\n");
			name = sc.next();

			System.out.println("Agora digite sua idade\n");
			idade = sc.nextInt();

			if (minima < idade) {
				minima = idade;
				nameMin = name;
			}

			max--;
		} while (max >= 1);

		System.out.println("\n" + nameMin + " � a pessoa mais nova e tem " + minima + " anos");
	}

}

// O programa n�o esta funcionando corretamente, 
// ele esta entrando no if mesmo n�o sendo
// minima < idade e grava sempre a ultima informa��o como a minima.
