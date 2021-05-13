package exercicios;

import java.util.Scanner;

public class List1Ex5 {

	public static void main(String[] args) {
		
		/*
		 Crie um algoritmo que leia o 
		 valor do salário mínimo e o valor 
		 do salário de um usuário, calcule 
		 a quantidade de salários mínimos 
		 esse usuário ganha e imprima o 
		 resultado. (1SM=R$1045,00)  
		 
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de um Salário Mínimo atualmente.");
		float sm = sc.nextFloat();
		
		System.out.println("");
		System.out.println("Digite o seu salário");
		float salario = sc.nextFloat();
		
		float divSal = salario / sm ;
		
		System.out.println("------------------------------------------------------");
		System.out.println("No meu salário, eu recebo " + divSal + " salários mínimos");
		System.out.println("------------------------------------------------------");
		
		
	}

}
