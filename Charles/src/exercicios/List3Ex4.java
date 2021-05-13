package exercicios;

import java.util.Scanner;

public class List3Ex4 {
	public static void main(String[] args) {

//		Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
//		Conforme a letra escrever: 
//		F - Feminino, 
//		M - Masculino, 
//		Sexo Inválido.

		Scanner sc = new Scanner(System.in);

		System.out.println("Sendo 'F' Feminino e 'M' masculino ");
		System.out.println("Digite a letra correspondente ao seu sexo: \n");

		String alpha = sc.next();

		if (alpha.equalsIgnoreCase("f")) {
			System.out.println("Você é do sexo Feminino");
		} else if (alpha.equalsIgnoreCase("m")) {
			System.out.println("Você é do sexo Masculino");
		}else {
			System.out.println("Sexo inválido");
		}
	}
}
