package exercicios;

import java.util.Scanner;

public class List3Ex6 {

	public static void main(String[] args) {
//		Ler um número e se for maior que 20,
//      mostrar a metade desse número.
		
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer: \n");
		double num = sc.nextDouble();
		
		if(num > 20 ) {
		double	num2 = num / 2;
		
		System.out.println("a metade de " + num +" é " + num2);
			
		}
		
		System.out.println("Fim do Programa");
		
		
	}

}
