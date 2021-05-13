package exerciciosLista4;

import java.util.Scanner;

public class List4Ex6 {

	public static void main(String[] args) {
		
//		Fa�a um Programa que pergunte em que turno voc� estuda. 
//		Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. 
//		Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" 
//		ou "Valor Inv�lido!", conforme o caso.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Em que turno voc� estuda?");
		System.out.println("\nDigite 'M' para Matutino\nDigite 'V' para Vespertino\nDigite 'N' para Noturno");
		String periodo = sc.next();
		
		switch(periodo) {
		
		case "M": case "m":
		System.out.println("Bom Dia!");
		break;
		
		case "V": case "v":
		System.out.println("Boa Tarde!");
		break;
		
		case "N": case "n": 
			
		System.out.println("Boa Noite!");
		break;
	
		default:
		System.out.println("ERRO - opera��o n�o existente");
	    }
	
	}

}
