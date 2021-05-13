package exercicios;

import java.util.Scanner;

public class List2Ex4 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça o 
		 * raio de um círculo, calcule e mostre sua área.
		 * A = PI * r * r
		 */
		Scanner sn = new Scanner(System.in);
		
		System.out.println("-------------------------");
		System.out.println("Calculo da Circunferência");
		System.out.println("-------------------------");
		
		System.out.println("\n Qual é o Raio da Circunferência?");
		double raio = sn.nextDouble();
		
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println("A área da circunferência é: " + area);
		
		

	}

}
