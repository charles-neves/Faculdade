package exercicios;

import java.util.Scanner;

public class List3Ex3 {

	public static void main(String[] args) {
	
//		Fa�a um algoritmo que receba um n�mero e 
//		mostre uma mensagem caso este n�mero seja maior que 10.
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero qualquer: \n");
		double num = sc.nextDouble();
		
		if(num > 10 ) {
			System.out.println("Este n�mero � maior que 10! ");
		}
		
		
	}

}
