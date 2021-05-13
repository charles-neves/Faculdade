package exercicios;

import java.util.Scanner;

public class List3Ex3 {

	public static void main(String[] args) {
	
//		Faça um algoritmo que receba um número e 
//		mostre uma mensagem caso este número seja maior que 10.
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer: \n");
		double num = sc.nextDouble();
		
		if(num > 10 ) {
			System.out.println("Este número é maior que 10! ");
		}
		
		
	}

}
