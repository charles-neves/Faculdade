package exerciciosLista5;

import java.util.Scanner;

public class List5Ex3 {

	public static void main(String[] args) {
//		Escreva um programa que leia um valor correspondente ao n�mero 
//		de jogadores de um time de v�lei. O programa dever� ler uma altura 
//		para cada um dos jogadores e, ao final, informar a altura m�dia do time

		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		double somaAlt = 0;
		int numJog = 1;
		double alt = 0;
		
		
		
		System.out.println("digite o n�mero de jogadores do time ");
		numJog = sc.nextInt();
		
		while (i <= numJog) {
			System.out.println("digite a altura do jogador "+ i);
				alt = sc.nextDouble();
				somaAlt += alt;
				i++;
				}
			System.out.printf("A m�dia de altura do time � = %.2f",(somaAlt/numJog));
			
		
		
		
	}

}
                 
