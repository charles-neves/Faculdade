package exercicios;

import java.util.Scanner;

public class List1Ex5 {

	public static void main(String[] args) {
		
		/*
		 Crie um algoritmo que leia o 
		 valor do sal�rio m�nimo e o valor 
		 do sal�rio de um usu�rio, calcule 
		 a quantidade de sal�rios m�nimos 
		 esse usu�rio ganha e imprima o 
		 resultado. (1SM=R$1045,00)  
		 
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de um Sal�rio M�nimo atualmente.");
		float sm = sc.nextFloat();
		
		System.out.println("");
		System.out.println("Digite o seu sal�rio");
		float salario = sc.nextFloat();
		
		float divSal = salario / sm ;
		
		System.out.println("------------------------------------------------------");
		System.out.println("No meu sal�rio, eu recebo " + divSal + " sal�rios m�nimos");
		System.out.println("------------------------------------------------------");
		
		
	}

}
