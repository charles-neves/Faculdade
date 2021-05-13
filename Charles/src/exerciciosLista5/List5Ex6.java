package exerciciosLista5;

import java.util.Scanner;

public class List5Ex6 {

	public static void main(String[] args) {
		// Fa�a o mesmo que antes, por�m, ao inv�s de ler 10 n�meros, 
		// o programa dever� ler e somar n�meros at� que o valor digitado seja zero ( 0 ).

		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int soma = 0;
		int num = 1;

		System.out.println("digite um n�mero inteiro,\n"
				+ "digite '0' para sair do programa "
				+ "\n a qualquer momento ");
		while (i != 0) {
			num = sc.nextInt();
			soma += num;
			
			if (num == 0) {
				 i = num;
			}else {
				System.out.println("Digite outro n�mero ");
			}
		}
		System.out.println("a soma de todos os n�meros digitados � = "+ soma);
		
	}

}
