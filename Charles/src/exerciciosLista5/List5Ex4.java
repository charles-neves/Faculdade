package exerciciosLista5;

import java.util.Scanner;

public class List5Ex4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Digitados dois n�meros (base e expoente), 
//		calcule o resultado utilizando apenas multiplica��es;
		
		System.out.println("digite um n�mero base para sua taboada\n ");
		int numBase = sc.nextInt();

		System.out.println("digite um n�mero do multiplo final para sua taboada\n ");
		int numFim = sc.nextInt();

		int i = 0;
		while(i <= numFim) {
		int	result = numBase * i;
			System.out.println(numBase + " x " + i + " = " + result);
			i++;
		}

	}

}
