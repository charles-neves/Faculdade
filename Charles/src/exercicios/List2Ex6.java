package exercicios;

import java.util.Scanner;

public class List2Ex6 {

	public static void main(String[] args) {
//		Fa�a um Programa que pergunte quanto voc� ganha por hora e 
//		o n�mero de horas trabalhadas no m�s. Calcule e mostre o 
//		total do seu sal�rio no referido m�s.

		Scanner sn = new Scanner (System.in);
		
		System.out.println("Digite quanto ganha por HORA ");
		double valorHora = sn.nextDouble();
		System.out.println("");
		
		System.out.println("Digite quantas horas trabalha por M�S ");
		double quantHora = sn.nextDouble();
		System.out.println("");
		
		double salario = quantHora * valorHora;

		System.out.println("Este m�s seu salario ser� " + salario );
		
		
	}

}
