package exercicios;

import java.util.Scanner;

public class List2Ex4 {

	public static void main(String[] args) {
		/*
		 * Fa�a um Programa que pe�a o 
		 * raio de um c�rculo, calcule e mostre sua �rea.
		 * A = PI * r * r
		 */
		Scanner sn = new Scanner(System.in);
		
		System.out.println("-------------------------");
		System.out.println("Calculo da Circunfer�ncia");
		System.out.println("-------------------------");
		
		System.out.println("\n Qual � o Raio da Circunfer�ncia?");
		double raio = sn.nextDouble();
		
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println("A �rea da circunfer�ncia �: " + area);
		
		

	}

}
