package exercicios;

import java.util.Scanner;

public class List1Ex3 {

	public static void main(String[] args) {
		/*
		 Informar um saldo e imprimir 
		 o saldo com reajuste de 1%. 
		  */

		Scanner sc = new Scanner(System.in);
		System.out.println("digite o Saldo da sua conta: ");
		double saldo = sc.nextDouble();
		
		double reajuste = saldo + (saldo * 0.01);
		
		System.out.printf("o Saldo reajustado é " + reajuste);
		
		
		
	}

}
