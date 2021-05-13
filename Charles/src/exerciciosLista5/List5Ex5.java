package exerciciosLista5;

import java.util.Scanner;

public class List5Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int opcao = 1;
	while(opcao !=0) {
		System.out.println("****************************\n"
				 		 + "1 - Continuar no programa\n"
						 + "0 - Sair\n"
		 		 		 + "****************************\n"
		 		 		 + "Escolha sua op��o");

		opcao = sc.nextInt();
	}
	System.out.println("Finalizando o programa!!!");
	}

}
