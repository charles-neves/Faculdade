package exerciciosLista5;

import java.util.Scanner;

public class List5Ex7 {

	public static void main(String[] args) {

//		Fa�a um algoritmo que escreva na tela os 
//		n�meros de um n�mero inicial a um n�mero final. 
//		E mostre a quantidade de n�meros pares
//		e quantidade de n�meros �mpares.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero de in�cio ");
		int numInicial = sc.nextInt();
		
		System.out.println("Digite um n�mero para fim ");
		int numFinal = sc.nextInt();
		
		int pares = 0;
		int impares = 0;
		
		while(numInicial != (numFinal + 1)) {
			if(numInicial % 2 == 1) {
				impares++;
			}else {
				pares++;
			}
		numInicial++;	
		}
		System.out.println("A quantidade de n�meros pares � de "+ pares);
		System.out.println("E a quantidade de n�meros impares � de "+ impares);
	}

}
