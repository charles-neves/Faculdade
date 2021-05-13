package exercicios;

import java.util.Scanner;

public class List1Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		/*
		 * Desenvolva um algoritmo em Java que leia um 
		 * número inteiro e imprima o seu antecessor e seu sucessor.
		 */
		
		System.out.println("digite um número inteiro qualquer");
		int num = sc.nextInt();
		System.out.println("");
		System.out.println("Antecessor " + (num - 1));
		System.out.println("Sucessor "+ (num + 1));
		
		

	}

}
