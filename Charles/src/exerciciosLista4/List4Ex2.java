package exerciciosLista4;

import java.util.Scanner;

public class List4Ex2 {

	public static void main(String[] args) {
//		2. Elabore um programa que receba dois n�meros inteiros 
//		e mostre para o usu�rio um menu com as op��es: 
//		   1 � Soma    
//		   2 � Subtra��o 
//		   3 � Divis�o 
//		   4 � Multiplica��o 
//		   E fa�a a opera��o desejada pelo usu�rio.

		Scanner sc = new Scanner(System.in);

		System.out.println("\nDigite dois n�meros e o sistema efetuar� a opera��o desejada,\nPrimeiro n�mero: ");
		double n1 = sc.nextDouble();

		System.out.println("\n Digite o segundo n�mero: ");
		double n2 = sc.nextDouble();
		
		System.out.println("\nAgora escolha o N�mero da opera��o desejada \n1 � Soma\n2 � Subtra��o\n3 � Divis�o\n4 - Multiplica��o\n ");
		int operation = sc.nextInt();
		double result = 0;
		
		if (operation == 1) {
			result = n1 + n2;
			
		}
		else if (operation == 2) {
			result = n1 - n2;
			
		}
		else if (operation == 3) {
			result = n1 / n2;
			
		}
		else if (operation == 4) {
			result = n1 * n2;
			
		}
		else {
			System.out.println("ERRO - opera��o n�o existente");
		}
		
		System.out.println("O resultado da opera��o � "+ result);
			
	}

}
