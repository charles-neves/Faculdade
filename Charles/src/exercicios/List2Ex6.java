package exercicios;

import java.util.Scanner;

public class List2Ex6 {

	public static void main(String[] args) {
//		Faça um Programa que pergunte quanto você ganha por hora e 
//		o número de horas trabalhadas no mês. Calcule e mostre o 
//		total do seu salário no referido mês.

		Scanner sn = new Scanner (System.in);
		
		System.out.println("Digite quanto ganha por HORA ");
		double valorHora = sn.nextDouble();
		System.out.println("");
		
		System.out.println("Digite quantas horas trabalha por MÊS ");
		double quantHora = sn.nextDouble();
		System.out.println("");
		
		double salario = quantHora * valorHora;

		System.out.println("Este mês seu salario será " + salario );
		
		
	}

}
