package exercicios;

import java.util.Scanner;

public class List3Ex4 {
	public static void main(String[] args) {

//		Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". 
//		Conforme a letra escrever: 
//		F - Feminino, 
//		M - Masculino, 
//		Sexo Inv�lido.

		Scanner sc = new Scanner(System.in);

		System.out.println("Sendo 'F' Feminino e 'M' masculino ");
		System.out.println("Digite a letra correspondente ao seu sexo: \n");

		String alpha = sc.next();

		if (alpha.equalsIgnoreCase("f")) {
			System.out.println("Voc� � do sexo Feminino");
		} else if (alpha.equalsIgnoreCase("m")) {
			System.out.println("Voc� � do sexo Masculino");
		}else {
			System.out.println("Sexo inv�lido");
		}
	}
}
