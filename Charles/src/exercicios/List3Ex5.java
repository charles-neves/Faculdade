package exercicios;

import java.util.Scanner;

public class List3Ex5 {

	public static void main(String[] args) {
//		Dada a idade de um nadador,	informe a sua categoria: 			
//		Infantil (at� 10 anos), 
//		Juvenil (at� 17 anos) ou 
//		S�nior (acima de 17 anos).

Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: \n");
		int idade = sc.nextInt();
		
		if(idade <= 10 ) {
			System.out.println("Este nadador esta na categoria Infantil ");
		}
		else if(idade > 10 &&  idade <= 17 ) {
			System.out.println("Este nadador esta na categoria Juvenil ");
		}else {
			System.out.println("Este nadador esta na categoria  S�nior ");
		}
		
		
	}

}
