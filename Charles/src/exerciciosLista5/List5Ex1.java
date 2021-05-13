package exerciciosLista5;

import java.util.Scanner;

public class List5Ex1 {
	public static void main(String[] args) {

		// leia 10 int e exiba:
		// a) a soma dos positivos
		// b) a quantidade de negativos

		Scanner sc = new Scanner(System.in);
		int i = 1;
		int negativos = 0;
		int soma = 0;
		int num = 0;

		while (i <= 10) {
			System.out.println("digite um n�mero inteiro ");
			num = sc.nextInt();
			if (num >= 0) {
				soma = soma + num;
			} else {
				negativos++;
			}
			i++;
		}

		System.out.println("A soma dos numeros positivos �: " + soma);
		System.out.println("O total de n�meros negativos digitados foi: " + negativos);

	}

}

