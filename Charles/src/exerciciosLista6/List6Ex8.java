package exerciciosLista6;

import java.util.Scanner;

public class List6Ex8 {

	public static void main(String[] args) {
		// Desenvolva um algoritmo que receba dez n�meros e calcule a m�dia desses dez n�meros.
		
		Scanner sc = new Scanner(System.in);
		
		int max = 10;
		double soma = 0;
		
		for(int i=1; i <= max;i++) {
			System.out.println("digite um n�mero");
			double numero = sc.nextDouble();
		 soma += numero;
		} 
		
	double media = (soma/max);
	
	System.out.printf("A m�dia dos n�meros digitados � %.2f ", media);
		
	}

}
